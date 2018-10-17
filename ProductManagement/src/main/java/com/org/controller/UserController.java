package com.org.controller;

import java.security.Principal;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.entities.Produit;
import com.org.entities.User;
import com.org.service.ProduitService;
import com.org.service.UserService;

@SpringBootApplication
@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	
	@RequestMapping("app/user") 
	 public Principal User(Principal user) {
		
	 return user; 
	}
	
	@PostMapping("/user")
	public User AddUser(@RequestBody User u){	
		
		 return service.addUser(u); 
    }
	 
	@DeleteMapping("/user/{id}")
	public User deleteUser(@PathVariable("id")Long id){	
		
		 return service.deleteUser(id);  
    } 
	
//	public User attribueRoleAUtilisateur(User u, Long idRole){		
//		return service.attribueRoleAUtilisateur(u, idRole); 
//		
//		
//	}
		
}
