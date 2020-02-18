package com.fst.demo.Security;
//package com.fr.adaming.demo.config;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
//
//
////annotation activation spring security JWT
//@EnableAuthorizationServer
//@Configuration
//public class JwtConfig extends AuthorizationServerConfigurerAdapter {
//	
//	@Autowired
//	@Qualifier("UserDetailsService")
//	private UserDetailsService userDetailsService;
//	
//	@Autowired
//	private AuthenticationManager authenticationManager;
//
//	@Value("${varun.oauth.tokenTimeout:3600}")
//	private int expiration;
//	
//	@Autowired
//	private JwtAccessTokenConverter  accessTokenConverter;
//	
//	//private String signingKey;
//	
//	@Autowired
//	private TokenStore tokenStore;
//	
//	
//	@Bean
//	public PasswordEncoder passwordEcoder() {
//		return new BCryptPasswordEncoder();
//		
//	}
//		
//	
//	
//	@Bean
//	public TokenStore tokenStore() {
//		return new JwtTokenStore (accessTokenConverter());
//			
//	}
//	
//	
//	@Bean
//	public JwtAccessTokenConverter accessTokenConverter() {
//		JwtAccessTokenConverter converter=new JwtAccessTokenConverter();
//     converter.setSigningKey("jwtdemo123");	
//	         return converter;
//	}
//		
//	//generate the TOKEN
//		
//		public void configure(AuthorizationServerEndpointsConfigurer configurer) throws Exception{
//			TokenEnhancerChain enhancerChain =new TokenEnhancerChain();
//			 List list=Arrays.asList(accessTokenConverter) ;
//			 enhancerChain.setTokenEnhancers(list);
//			 
//			 configurer.tokenStore(tokenStore)
//			 .accessTokenConverter(accessTokenConverter)
//			.tokenEnhancer(enhancerChain);
//			 
//			 
//			 
//			 //fetching the data from the database
//			 
//			 configurer.authenticationManager(authenticationManager);
//			 configurer.userDetailsService(userDetailsService);
//			 
//		}
//		
//		
//		public void configure(ClientDetailsServiceConfigurer clients) throws Exception{
//	
//clients.inMemory().withClient("varun").secret("secret").accessTokenValiditySeconds(expiration).scopes("read","write").authorizedGrantTypes("password","refresh_token").resourceIds("recource");
//	
//	
//	
//	
//	
//	
//	
//		}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	public AuthenticationManager getAuthenticationManager() {
//		return authenticationManager;
//	}
//
//	public void setAuthenticationManager(AuthenticationManager authenticationManager) {
//		this.authenticationManager = authenticationManager;
//	}
//	
//}
