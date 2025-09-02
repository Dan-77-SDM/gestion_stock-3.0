package com.Axi_Tech.gestionstock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Axi_Tech.gestionstock.entities.Produit;
import com.Axi_Tech.gestionstock.services.ProduitService;

@Controller
@RequestMapping("/produits")
public class ProduitController {
    private ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

     @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("produit", new Produit());
        return "form"; // -> templates/produits/form.html
    }

    // Traitement du formulaire d'ajout
    @PostMapping("/add")
    public String addProduct(@ModelAttribute("produit") Produit produit) {
        produitService.addProduct(produit);
        return "form"; // redirige vers la liste après ajout
    }

}
