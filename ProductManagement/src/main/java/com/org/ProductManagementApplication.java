package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.org.entities.Produit;
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
		
//     List<Produit>produits = produit.getAllPrduits();
//		System.out.println(produits.toString());  
//		
//		System.out.println(produits.get(1).getNom()); 
	}
	
	}
	
	
	


