package com.org.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.org.entities.Produit;

@Component
public interface IProduit extends JpaRepository<Produit, String>{ 
	//@Query("select p from Produit p where p.ref = :x")
	public Produit findProduitByRef(String ref);
//	public List<Produit> getProduits();
//	public Produit addProduit(Produit p);
//	public Produit upDateProduit(Produit p);
//	public void deletProd(String nom);
	
}