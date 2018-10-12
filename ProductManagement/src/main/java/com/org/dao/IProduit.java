package com.org.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.org.entities.Produit;

@Repository
public interface IProduit extends JpaRepository<Produit, String>{ 
	
	public Produit findProduitByRef(String ref);
	
	
}