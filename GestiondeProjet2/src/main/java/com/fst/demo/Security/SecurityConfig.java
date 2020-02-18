package com.fst.demo.Security;
//package com.fr.adaming.demo.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration	
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
//	@Autowired
//	private UserDetailsServiceImpl userDetailsService;
//	//UserDetailsServiceImpl
//	 @Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//	//	super.configure(auth);
//		 auth.userDetailsService(userDetailsService);
//	}
//	
//	 @Override
//		public void configure(HttpSecurity http) throws Exception {
//		  
//		//http.formLogin();
//		 http.csrf().disable();
//		 http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//		 http.authorizeRequests().antMatchers("/login").permitAll();
//		 //http.authorizeRequests().antMatchers("/swagger-ui.html").permitAll();
//		 
//		//http.authorizeRequests().antMatchers("/appUsers/**","/appRoles/**").hasAuthority("Admin");
//		
//		http.authorizeRequests().anyRequest().permitAll();
//        http.addFilter(new JWTAuthentificationFilter(authenticationManager()));
//        http.addFilterBefore(new JwtAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
//	 }
//	 
//	 
//	 
//	
//}
