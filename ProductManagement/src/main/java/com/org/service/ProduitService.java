package com.org.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.org.dao.IProduit;
import com.org.entities.Produit;

@Service
public class ProduitService{
	
	@Autowired
	IProduit dao;
	
	public Produit addProduit(Produit p){
		
		return dao.save(p);
	}
	
	public List<Produit>getAllProduits(){
		
		return dao.findAll();
		
	}
	
	public Produit getProduitByRef(String ref){
		
		return dao.findProduitByRef(ref); 
		
	}
  public Produit upDateProduit(String ref){
	Produit p = dao.findProduitByRef(ref);  
    dao.save(p); 
		
	return p; 
		
	}
  
  public Produit deletProduit(String ref){
		Produit p = dao.findProduitByRef(ref);  
	    dao.delete(p); 
			
		return p;
}
}	