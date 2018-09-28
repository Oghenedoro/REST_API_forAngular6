package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.dao.IProduit;
import com.org.entities.Produit;

@RestController
public class ProduitController {
	
	@Autowired
	IProduit service;

	//@RequestMapping(value="/products",method=RequestMethod.GET)
	@GetMapping("/prods")
	public List<Produit> getProduits(){	
		 return service.getAllPrduits();	
			
  }
	
	
	@GetMapping("/prods/{num}")
	public Produit getProduit(@PathVariable("num") String num){	
		 return service.getProduit(num);	
			
  }
	@PostMapping("/prods")
	public Produit AddProduit(@RequestBody Produit p){	
		 return service.addProduit(p); 
 }
	@DeleteMapping("/prods/{num}")
	public void deleteProduit(@PathVariable("num") String num){	
				
		 service.deleteProduit(num);	
			
  }
	
	@PutMapping("/prods")
	 public Produit modifieProduit(@RequestBody Produit p){	
		//Produit prod = new Produit();
		p.setNom(p.getNom()); 
		p.setPrixUnitaire(p.getPrixUnitaire());
		p.setQuantity(p.getQuantity());
		
		 return service.addProduit(p); 
  }
	
	
}