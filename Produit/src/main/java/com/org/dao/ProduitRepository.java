package com.org.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.org.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

	@Query("Select p from Produit p where p.designation like :x")
	public Page<Produit> getProduitParMC(@Param("x")String mc, Pageable p);

}
