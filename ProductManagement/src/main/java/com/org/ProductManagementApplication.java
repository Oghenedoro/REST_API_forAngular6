package com.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.org.entities.Produit;
import com.org.entities.Role;
import com.org.entities.User;
import com.org.service.ProduitService;
import com.org.service.UserService;
import com.org.util.RoleEnum;


@SpringBootApplication
public class ProductManagementApplication implements CommandLineRunner{
	
//	@Autowired
//	ProduitService service;
//	
//	@Autowired
//	UserService userService;

	public static void main(String[] args) {
	 SpringApplication.run(ProductManagementApplication.class, args);
	
 }
	@Override
	public void run(String... args) throws Exception {
		
//		service.addProduit(new Produit("AA","book",25,10));
//		service.addProduit(new Produit("A1","tele",30,1025));
//		service.addProduit(new Produit("A2","ccar",14,5000));
//		
//		Role roleUser = new Role(RoleEnum.ROLE_USER);
//		Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
//				
//		
//		service.addRole(roleUser);
//		service.addRole(roleAdmin);
//				
//		User userRole = new User("user","pass",true);
//		userRole.setRoles(Arrays.asList(roleUser));			    
//		userService.addUser(userRole);
//				
//		User userAdmin = new User("user3","pass3",true);
//	    userAdmin.setRoles(Arrays.asList(roleUser,roleAdmin));	    
//	    userService.addUser(userAdmin);
     		
	 }
	
	}
	
	
	


