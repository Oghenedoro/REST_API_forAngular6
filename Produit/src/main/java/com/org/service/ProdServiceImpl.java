package com.org.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.org.dao.IProduit;
import com.org.entities.Produit;
@Service
public class ProdServiceImpl implements IProduit {
	
	//private Map<String, Produit>listProd;
	private List<Produit> listProd;
	
    public ProdServiceImpl(){
    	listProd=new ArrayList();
    	listProd.add(new Produit("comp", 25, 120));
    	listProd.add(new Produit("phone", 23, 45));
    	listProd.add(new Produit("bag", 13, 45));
	}
	
	@Override
	public Produit getProduit(String nom) {
		
		return listProd.get(0); 
	}		

	@Override
	public Produit addProduit(Produit p) {
		listProd.add(p);		
		return (Produit) listProd;
	}

	@Override
	public Produit upDateProduit(Produit p) {
		listProd.add(p);
		return (Produit) listProd; 
	}

	@Override
	public void deleteProduit(String nom) {
		Produit prod = new Produit();
		prod.setNom(nom); 
		listProd.remove(nom);
	}

	@Override
	public List<Produit> getAllPrduits() {
		
		return listProd;
	}

}
