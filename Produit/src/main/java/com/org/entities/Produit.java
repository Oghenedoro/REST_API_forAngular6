package com.org.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Produit implements Serializable{

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//private Long idProduit;
	//private String designation;
	//private double prix;
	//private int quantity;
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	public Produit(String designation, double prix, int quantity) {
//		super();
//		this.designation = designation;
//		this.prix = prix;
//		this.quantity = quantity;
//	}
//	
//	public Long getIdProduit() {
//		return idProduit;
//	}
//	public void setIdProduit(Long idProduit) {
//		this.idProduit = idProduit;
//	}
//	public String getDesignation() {
//		return designation;
//	}
//	public void setDesignation(String designation) {
//		this.designation = designation;
//	}
//	public double getPrix() {
//		return prix;
//	}
//	public void setPrix(double prix) {
//		this.prix = prix;
//	}
//	public int getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
	
	private String nom;
	private int quantity;
	private int prixUnitaire;
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
