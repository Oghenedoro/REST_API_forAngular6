package com.org.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.org.dao.UserRepository;
import com.org.entities.Role;
import com.org.entities.User;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		boolean accountNonExpired = true;  
  		boolean credentialsNonExpired = true;  
  		boolean accountNonLocked = true; 
  		 
  		User user = userRepository.findByUserName(userName);
  		
  		UserDetails userDetails = new org.springframework.security.core.userdetails.User( 
  						
  				userName,  
  				user.getPassWord(),  
  				user.getEnable(),  
  				accountNonExpired,  
  				credentialsNonExpired,  
  				accountNonLocked,  
  				getAuthorities(user.getRoles())); 
  		 
  		return userDetails; 
  	} 
  	 
  	private Collection<? extends GrantedAuthority> getAuthorities(List<Role> roles) { 
  		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>(); 
  		for (Role role: roles) { 
  			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRoleName()); 
  			grantedAuthorities.add(grantedAuthority); 
  		} 
  		return grantedAuthorities; 
  	} 
  

  } 

