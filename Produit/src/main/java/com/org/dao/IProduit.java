package com.org.dao;

import java.util.List;

import com.org.entities.Produit;

public interface IProduit {
  public Produit getProduit(String nom);
  public Produit addProduit(Produit p);
  public Produit upDateProduit(Produit p);
  public void deleteProduit(String nom);
  public List<Produit> getAllPrduits();
}
