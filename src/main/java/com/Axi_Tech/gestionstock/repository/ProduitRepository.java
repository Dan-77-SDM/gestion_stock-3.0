package com.Axi_Tech.gestionstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Axi_Tech.gestionstock.entities.Produit;

public interface ProduitRepository  extends JpaRepository<Produit, Long> {

}
