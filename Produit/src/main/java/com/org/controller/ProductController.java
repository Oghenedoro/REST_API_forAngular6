package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dao.IProduit;
import com.org.entities.Produit;
import com.org.service.ProdServiceImpl;


@RestController
@RequestMapping("/app")
public class ProductController {
	
	@Autowired
	IProduit service;

//	@GetMapping("/{nom}")
//	public Produit getProduits(String nom){
//		return service.getProduit(nom);
//		
//	}
	public List<Produit> getProduits(){	
	 return service.getAllPrduits();	
		
	}
}
