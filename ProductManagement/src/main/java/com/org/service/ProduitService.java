package com.org.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.IProduit;
import com.org.dao.IRole;
import com.org.dao.IUser;
import com.org.entities.Produit;
import com.org.entities.Role;
import com.org.entities.User;




@Service
public class ProduitService{
	
	@Autowired
	IProduit dao;
	@Autowired
	IUser userDao;
	@Autowired
	IRole roleDao;
	
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
  
  public User addUser(User user){
	 Role r = roleDao.findByRoleName(new Role().getRoleName()); 
	 user.setRoles(new ArrayList<Role>(Arrays.asList(r)));
	 
	  return userDao.save(user);
  }
  
  public Role addRole(Role role){
	return roleDao.save(role); 
	  
  }
}	