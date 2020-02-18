package com.fst.demo.Security;
//package com.fr.adaming.demo.config;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//
//public class JwtAuthorizationFilter extends OncePerRequestFilter{
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		//System.out.println("*********************************");
//		//System.out.println(request.getHeaderNames());
//		response.addHeader("Access-Control-Allow-Origin", "*");
//		response.addHeader("Access-Control-Allow-Headers", "Origin, Accept, X-requested-With, Content-Type, Access-Control-Request-Method, Acces-Control-Request-Headers, Authorization");
//		response.addHeader("Access-Control-Expose-Headers", "Access-Control-Allow-Origin, Access-Control-Allow-Credentials, Authorization, Exception");
//		response.addHeader("Access-Control-Allow-Methods", "GET,POST,DELETE,PUT");
//		//System.out.println("*********************************");
//		System.out.println(request.getMethod());
//		if(request.getMethod().equals("OPTIONS"))
//		{
//			response.setStatus(HttpServletResponse.SC_OK);
//		}
//		else {
//			System.out.println(request.getHeaderNames());
//			String jwtToken = request.getHeader("Authorization");
//			System.out.println(jwtToken);
//			if(jwtToken==null || !jwtToken.startsWith("Bearer "))
//			{System.out.println("in if token is null");
//			System.out.println(filterChain.toString());
//				filterChain.doFilter(request, response); return;
//			}
//			//System.out.println("=======================");
//			//jwtToken.replace(SecurityConstants.TOKEN_PREFIX, " ");
//			System.out.println("=======================");
//			Claims claims = Jwts.parser()
//					.setSigningKey("oussama@ayari")
//					.parseClaimsJws(jwtToken.replace("Bearer ", ""))
//					.getBody();
//			String username = claims.getSubject();
//			System.out.println(username);
//			//ArrayList<Map<String , String>> privileges = (ArrayList<Map<String,String>>)claims.get("privileges");
//			List<String> roles = (List<String>)claims.get("roles");
//			Collection<GrantedAuthority> authorities = new ArrayList<>();
//			roles.forEach(p ->{
//				authorities.add(new SimpleGrantedAuthority(p/*.get("authority")*/));
//			});
//			UsernamePasswordAuthenticationToken authtoken = new UsernamePasswordAuthenticationToken(username, null, authorities);
//			SecurityContextHolder.getContext().setAuthentication(authtoken);
//			System.out.println(SecurityContextHolder.getContext().getAuthentication());
//			filterChain.doFilter(request, response);
//		}
//	}
//	
//	
//
//}
