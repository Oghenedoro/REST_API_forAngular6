package com.org.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.IProduit;
import com.org.dao.RoleRepository;
import com.org.dao.UserRepository;
import com.org.entities.Produit;
import com.org.entities.Role;
import com.org.entities.User;




@Service
public class ProduitService{
	
	@Autowired
	IProduit dao;
	
	@Autowired
	RoleRepository roleDao;
	
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
  
  
  public Role addRole(Role role){
	return roleDao.save(role); 
	  
  }
  
}	