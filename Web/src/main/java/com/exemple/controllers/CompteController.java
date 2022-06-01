package com.exemple.controllers;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.Compte;
import com.exemple.services.interfaces.ICompteService;

@RestController
public class CompteController {
	
	 @Autowired
	 private ICompteService compteService;

	    @GetMapping("/comptes")
	    public Collection<Compte> getAllComptes() {
	        Collection<Compte> comptes=compteService.getAllComptes();
	        return comptes;
	    }
	    
	    @GetMapping("/comptes/{id}")
	    public Optional<Compte> getCompteById(@PathVariable Long id) {
	        Optional<Compte> compte=compteService.getCompteById(id);
	        return compte;
	    }
	    
	    @PostMapping("/comptes")
	    public Compte addCompte(@RequestBody Compte compte) {
	        Compte compteSaved=compteService.addCompte(compte);
	        return compteSaved;
	    }
	    
	    @PutMapping("/comptes")
	    public Compte updateCompte(@RequestBody Compte compte) {
	        Compte compteUpdated=compteService.updateCompte(compte);
	        return compteUpdated;
	    }
	    
	    @DeleteMapping("/comptes/{id}")
	    public void deleteCompte(@PathVariable Long id) {
	        compteService.deleteCompte(id);
	    }

}
