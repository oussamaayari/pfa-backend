package com.fst.demo.Security;
//package com.fr.adaming.demo.config;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.fr.adaming.demo.models.AppUser;
//import com.fr.adaming.demo.services.IAccountService;
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//	@Autowired
//	private IAccountService iAccountService;
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//System.out.println("bd");
//System.out.println(username);
//	AppUser appUser =iAccountService.loadUserByUsername(username);
//	System.out.println(appUser.getUsername());
//		if (appUser==null) throw  new UsernameNotFoundException("invalid user");
//		Collection<GrantedAuthority> authorities=new ArrayList<>();
//		System.out.println("before");
//	    appUser.getRoles().forEach(r->{
//	    	authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
//	    });
//	    System.out.println("after");
//	    User user = new User(appUser.getUsername(),appUser.getPassword(),authorities);
//	    System.out.println(user.getUsername());
//	    System.out.println(user.getAuthorities());
//	    return user;
//	    	
//	    }
//		   
//		
//	}
//
//
