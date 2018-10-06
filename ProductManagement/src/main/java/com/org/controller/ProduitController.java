package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.org.service.ProduitService;

@RestController
@CrossOrigin
public class ProduitController {
	
	@Autowired
	ProduitService service;

	//@RequestMapping(value="/products",method=RequestMethod.GET)
	@GetMapping("/prods")
	public List<Produit> getProduits(){	
		 return service.getAllProduits();	
			
  }
	
	
	@GetMapping("/prods/{ref}")
	public Produit getProduit(@PathVariable("ref") String ref){	
		 return service.getProduitByRef(ref);	
			
  }
	@PostMapping("/prods")
	public Produit AddProduit(@RequestBody Produit p){	
		 return service.addProduit(p); 
 }
	@DeleteMapping("/prods/{ref}")
	public void deleteProduit(@PathVariable("ref") String ref){	
			
		 service.deletProduit(ref);	
			
  }
	
	@PutMapping("/prods")
	 public Produit modifieProduit(@RequestBody Produit p){	
		 Produit prod = service.getProduitByRef(p.getRef());
		 prod.setNom(p.getNom());
		 prod.setPrixUnitaire(p.getPrixUnitaire());
		 prod.setQuantity(p.getQuantity()); 
		 
		 service.addProduit(prod);
		 
	   return prod;
		 
	}
}