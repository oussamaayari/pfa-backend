package com.fst.demo.Security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fst.demo.models.AppUser;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTAuthenticationFilter0 extends UsernamePasswordAuthenticationFilter {

	private AuthenticationManager authentificationManager;

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		AppUser  emp = null;
		 
		try {
			emp = new ObjectMapper().readValue(request.getInputStream(), AppUser.class);
			System.out.println(emp.getUsername());
		} catch (Exception exp) {
			throw new RuntimeException(exp);
		}
		
		return authentificationManager
				.authenticate(new UsernamePasswordAuthenticationToken(emp.getUsername(), emp.getPassword()));
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		User springUser =(User) authResult.getPrincipal();
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		requestURI = requestURI.substring(contextPath.length());
		setAuthenticationSuccessHandler(new SimpleUrlAuthenticationSuccessHandler(requestURI)) ;
		java.util.List<String>roles = new ArrayList<String>();
		springUser.getAuthorities().forEach(a->{
			roles.add(a.getAuthority());
		});
	System.out.println(roles);
		String jwt=Jwts.builder().setSubject(
				springUser.getUsername()).setExpiration
				(new Date(System.currentTimeMillis()+SecurityConstants0.EXPIRATION_TIME))
				.signWith(SignatureAlgorithm.HS256,SecurityConstants0.SECRET)
				.claim("roles", roles)
				.compact();
		response.addHeader(SecurityConstants0.HEADER_STRING, SecurityConstants0.TOKEN_PREFIX+jwt);
	
	}

	public JWTAuthenticationFilter0(AuthenticationManager authenticationManager) {
		super();
		this.authentificationManager = authenticationManager;
	}

}
