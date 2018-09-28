package com.org.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.org.dao.IProduit;
import com.org.entities.Produit;

@Service
public class ProduitImpl implements IProduit{

private Map<String, Produit>listProd = new HashMap<String, Produit>();

    public ProduitImpl(){
    	listProd = initialiserProduit();
	}
	
	@Override
	public Produit getProduit(String myVal) {
		
		return listProd.get(myVal);  
	}		

	@Override
	public Produit addProduit(Produit p) {
				
		return listProd.put(p.getNom(), p); 
	}

	@Override
	public Produit upDateProduit(Produit p) {
		return listProd.put(p.getNom(), p);
	}

	@Override
	public void deleteProduit(String nom) {
		
		listProd.remove(nom);
	}

	@Override
	public List<Produit> getAllPrduits() {
		
		return new ArrayList<Produit>(listProd.values());
	}
	
  Map<String, Produit> initialiserProduit(){
		
		Map<String, Produit> prod = new HashMap<>();
		
		Produit p = new Produit("car", 1200, 5);
		Produit p2 = new Produit("comp", 25, 120);
		Produit p3 = new Produit("phone", 23, 45);
		
		prod.put("1", p);
		prod.put("2", p2);
		prod.put("3", p3);
    	
		return prod; 
    	
	}
	
	
}
