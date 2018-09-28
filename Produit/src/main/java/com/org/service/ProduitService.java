package com.org.service;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.dao.ProduitRepository;
import com.org.entities.Produit;

//@RestController
//public class ProduitService {
//	
//	@Autowired
//	ProduitRepository produitRepository;
//	
//	@RequestMapping(value="/produitss", method=RequestMethod.GET)
//	 public List<Produit> listProduits(){
//	   return produitRepository.findAll();
//		 
//	 }
//	
//	@RequestMapping(value="/produits", method=RequestMethod.GET)
//	 public Page<Produit> listProduits(int page, int size){
//	   return produitRepository.findAll(new PageRequest(page, size)); 
//		 
//	 }
//	
//	@RequestMapping(value="/produits/{id}",method=RequestMethod.GET)
//	   public Produit getProduit(@PathVariable("id") Long id){
//		   return produitRepository.findOne(id);  
//	   }
//
//	@RequestMapping(value="/produits", method=RequestMethod.POST)
//	 public Produit ajoiuteProduit(@RequestBody Produit p){		
//		 produitRepository.save(p);
//		 return p;
//	}
//	
//	@RequestMapping(value="/produits/{id}", method=RequestMethod.PUT)
//	   public Produit upDateProduit(@RequestBody Produit p, @PathVariable Long id){
//		p.setIdProduit(id); 
//
//		return produitRepository.saveAndFlush(p);  
//		     
//	   }
//	@RequestMapping(value="/produits/{idp}", method=RequestMethod.DELETE)
//	   public void deleteProduit(@PathVariable("idp")Long idP){
//		   Produit p = getProduit(idP);
//		   produitRepository.delete(p); 
//	 }	  
//	@RequestMapping(value="/chercherproduits", method=RequestMethod.GET)
//	 public Page<Produit> chercherProdParMC(
//			 String mc, 
//			 @RequestParam(name="page", defaultValue="0")int page,
//			 @RequestParam(name="size", defaultValue="5")int size){
//		
//		
//	   return produitRepository.getProduitParMC("%"+mc+"%",new PageRequest(page, size)); 
//		 
//	 }
//}
