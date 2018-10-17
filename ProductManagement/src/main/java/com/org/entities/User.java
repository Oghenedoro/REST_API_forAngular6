package com.org.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	private String userName;
	private String passWord;
	private boolean enable;
	
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="user_roles",
    joinColumns = {@JoinColumn(name="user_id")},
    inverseJoinColumns = {@JoinColumn(name="role_id")})
	private List<Role>roles;
	
	public User() {
		super();	
	}
	
	

	public User(String userName, String passWord, boolean enable) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.enable = enable;
	}



	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public boolean getEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}

    
	
	
}
