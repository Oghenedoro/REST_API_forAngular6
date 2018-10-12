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


@SpringBootApplication
public class ProductManagementApplication implements CommandLineRunner{
	
	@Autowired
	ProduitService service;

	public static void main(String[] args) {
	 SpringApplication.run(ProductManagementApplication.class, args);
	
 }
	@Override
	public void run(String... args) throws Exception {
		
		service.addProduit(new Produit("AA","book",25,10));
		service.addProduit(new Produit("A1","tele",30,1025));
		service.addProduit(new Produit("A2","ccar",14,5000));
		
		Role roleUser = new Role("USER");
		Role roleAdmin = new Role("ADMIN");
		
		service.addRole(roleUser);
		service.addRole(roleAdmin);
		
		User user = new User("user","password",true);
		user.setRoles(Arrays.asList(roleUser));
		    
		service.addUser(user);
		
		
		User userAdmin = new User("ADMIN","password2",true);
	     userAdmin.setRoles(Arrays.asList(roleUser,roleAdmin));
	    
    	service.addUser(userAdmin);
     
		
		
	}
	
	}
	
	
	


