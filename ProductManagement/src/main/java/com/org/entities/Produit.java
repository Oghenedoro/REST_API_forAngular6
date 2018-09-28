package com.org.entities;

public class Produit {

	private String nom;
	private int quantity;
	private int prixUnitaire;
	
	
	
	public Produit() {
		super();
		
	}
	public Produit(String nom, int quantity, int prixUnitaire) {
		super();
		this.nom = nom;
		this.quantity = quantity;
		this.prixUnitaire = prixUnitaire;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(int prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	
	
}
