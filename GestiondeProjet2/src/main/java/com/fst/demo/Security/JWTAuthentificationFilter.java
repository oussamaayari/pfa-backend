package com.fst.demo.Security;
//package com.fr.adaming.demo.config;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.auth0.jwt.JWT;
//import com.auth0.jwt.algorithms.Algorithm;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fr.adaming.demo.models.AppUser;
//
//public class JWTAuthentificationFilter extends UsernamePasswordAuthenticationFilter {
//
//	private AuthenticationManager authenticationManager;
//
//	
//	
//	public JWTAuthentificationFilter(AuthenticationManager authenticationManager) {
//		super();
//		this.authenticationManager = authenticationManager;
//	}
//
//
//
//	@Override
//	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
//			throws AuthenticationException {
//		System.out.println("in auttheticatiojn auth attempt");
//		//return super.attemptAuthentication(request, response);
//		AppUser appUser=null;
//		try {
//			appUser=new ObjectMapper().readValue(request.getInputStream(), AppUser.class);
//			System.out.println(appUser.getUsername());
//
//			return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(appUser.getUsername(), appUser.getPassword()));
//		} catch (IOException e) {
//		e.printStackTrace();
//		throw new RuntimeException(e);
//
//	}
//		
//	}
//	
//	
//
//
//
//
//
//	@Override
//	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,Authentication authResult) throws IOException, ServletException {
//	//			super.successfulAuthentication(request, response, chain, authResult);
//	 
//		System.out.println("in auttheticatiojn auth succeess");
//		 User user= (User) authResult.getPrincipal();
//	   List<String> roles=new ArrayList<>();
//	   authResult.getAuthorities().forEach(a->{
//		   roles.add(a.getAuthority());
//		      
//	   });
//	
//	   
//	   
//	   String jwt= JWT.create()
//			   		.withIssuer(request.getRequestURI())
//			   		.withSubject(user.getUsername())
//			   		.withArrayClaim("roles",roles.toArray(new String[roles.size()]))
//			   		.withExpiresAt(new Date(System.currentTimeMillis()+10*24*3600))
//			   		.sign(Algorithm.HMAC256("oussama@ayari"));               
//	   response.addHeader("Authorization","Bearer "+ jwt);
//	}
//	
//	
//     
//	
//	
//	
//	
//	
//	
////	@Override
////	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
////			throws IOException, ServletException {
////		// TODO Auto-generated method stub
////
////	}
//
//}
