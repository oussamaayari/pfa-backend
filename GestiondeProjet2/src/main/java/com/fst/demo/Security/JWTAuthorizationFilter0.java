package com.fst.demo.Security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JWTAuthorizationFilter0 extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Headers"," Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers, authorization");
		response.addHeader("Access-Control-Expose-Headers", "Access-Control-Allow-Origin, Access-Control-Allow-Credentials, authorization");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE,PATCH, OPTIONS");
		System.out.println(response.getHeaderNames());                                                                                                                      
		String jwt = request.getHeader(SecurityConstants0.HEADER_STRING);
	    System.out.println(jwt);
		if (request.getMethod().equals("OPTIONS"))
				{
			response.setStatus(HttpServletResponse.SC_OK);
				}
		
		else {
		if (jwt == null || !jwt.startsWith(SecurityConstants0.TOKEN_PREFIX)) {
			filterChain.doFilter(request, response);
			return;
		} 
			Claims claims = Jwts.parser().setSigningKey(SecurityConstants0.SECRET)
					.parseClaimsJws(jwt.replace(SecurityConstants0.TOKEN_PREFIX, "")).getBody();
			String username = claims.getSubject();
			Collection<GrantedAuthority> authorities = new ArrayList<>();
			//ArrayList<Map<String, String>> roles = (ArrayList<Map<String, String>>) claims.get("roles");
		//supprimer le warning!!
			@SuppressWarnings("unchecked")
			ArrayList<String> roles = (ArrayList<String>) claims.get("roles");
			roles.forEach(r -> {
				System.out.println("role:"+r);
				authorities.add(new SimpleGrantedAuthority(r));
			});
			System.out.println("authority"+authorities);
			UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username,null, authorities);
			SecurityContextHolder.getContext().setAuthentication(authenticationToken);
			filterChain.doFilter(request, response);
		}

	}

}
