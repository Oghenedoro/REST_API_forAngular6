package com.org.util;

public enum RoleEnum {

	ROLE_USER("ROLE_USER"), 
  	ROLE_ADMIN("ROLE_ADMIN");
   	 
  	private String roleName; 
  	 
  	RoleEnum(String name) { 
  		this.roleName = name; 
  	} 
  
 
  	public String getRoleName() { 
  		return roleName; 
  	} 
  
 
  	public void setRoleName(String name) { 
  		this.roleName = name; 
  	} 
  	
  } 