package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.org.dao.ProduitRepository;
import com.org.entities.Produit;

@SpringBootApplication
public class ProduitApplication implements CommandLineRunner{

	@Autowired
	ProduitRepository produitRepository;
	
 public static void main(String[] args) {		
   SpringApplication.run(ProduitApplication.class, args);
    
	}

	@Override
	public void run(String... arg0) throws Exception {
		
//	     produitRepository.save(new Produit("aa", 200, 10));
//	     produitRepository.save(new Produit("bb", 1200, 15));
//	     produitRepository.save(new Produit("ccc", 210, 13));
//	     produitRepository.save(new Produit("ddd", 550, 100));
//	     produitRepository.save(new Produit("ee", 20, 3));
//
//		 List<Produit>plist = produitRepository.findAll(); 
//	     plist.forEach(p -> System.out.println(p.getDesignation()));

	}
}
