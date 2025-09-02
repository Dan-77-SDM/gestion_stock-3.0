package com.Axi_Tech.gestionstock.services;

import org.springframework.stereotype.Service;

import com.Axi_Tech.gestionstock.entities.Produit;
import com.Axi_Tech.gestionstock.repository.ProduitRepository;

@Service
public class ProduitService {
    private ProduitRepository produitRepository;

     ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    public void addProduct(Produit produit){
        produitRepository.save(produit);
    }


}
