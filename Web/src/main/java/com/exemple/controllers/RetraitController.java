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

import com.exemple.Retrait;
import com.exemple.services.interfaces.IRetraitService;

@RestController
public class RetraitController {
	
	 @Autowired
	 private IRetraitService retraitService;

	    @GetMapping("/retraits")
	    public Collection<Retrait> getAllRetraits() {
	        Collection<Retrait> retraits=retraitService.getAllRetraits();
	        return retraits;
	    }
	    
	    
	    @GetMapping("/retraits/{id}")
	    public Optional<Retrait> getRetraitById(@PathVariable Long id) {
	        Optional<Retrait> retrait=retraitService.getRetraitById(id);
	        return retrait;
	    }
	    
	    @GetMapping("/retraits/compte/{id}")
	    public Collection<Retrait> getRetraitByCompte(@PathVariable Long id) {
	    	Collection<Retrait> retraits=retraitService.getRetraitByCompte(id);
	        return retraits;
	    }
	    
	    
	    @PostMapping("/retraits")
	    public Retrait addRetrait(@RequestBody Retrait retrait) {
	    	Retrait retraitSaved=retraitService.addRetrait(retrait);
	        return retraitSaved;
	    }
	    
	    @PutMapping("/retraits")
	    public Retrait updateRetrait(@RequestBody Retrait retrait) {
	    	Retrait retraitUpdated=retraitService.updateRetrait(retrait);
	        return retraitUpdated;
	    }
	    
	    @DeleteMapping("/retraits/{id}")
	    public void deleteRetrait(@PathVariable Long id) {
	    	retraitService.deleteRetrait(id);
	    }

}
