package com.org.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.RoleRepository;
import com.org.dao.UserRepository;
import com.org.entities.Role;
import com.org.entities.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userDao;
	@Autowired
	RoleRepository roleDao;
	
	public User addUser(User user){ 
		User u = userDao.save(user);			 
		return u;
	  }
	
	public void saveAll(Iterable<User> iterable) {		  
		  userDao.saveAll(iterable);
	  }
   
	public User deleteUser(Long idUser){
		
		User user = userDao.findByUserId(idUser);
		userDao.delete(user); 
		return user;		
	}
	
	public User attribueRoleAUtilisateur(User user,Long idRole){
		
		Role r = roleDao.findByRoleId(idRole);
		user.setRoles(Arrays.asList(r));  
		
		return user;
		
	}
}
