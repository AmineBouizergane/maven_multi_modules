package com.exemple.services.implementation;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.Compte;
import com.exemple.CompteRepos;
import com.exemple.services.interfaces.ICompteService;

@Service
public class CompteServiceImpl implements ICompteService{
	
	 @Autowired
	 private CompteRepos compteRepos;

	    public Collection<Compte> getAllComptes() {
	        Collection<Compte> comptes=compteRepos.findAll();
	        return comptes;
	    }
	    
	    public Optional<Compte> getCompteById(Long id) {
	        Optional<Compte> compte=compteRepos.findById(id);
	        return compte;
	    }
	    
	    public Compte addCompte(Compte compte) {
	        Compte compteSaved=compteRepos.save(compte);
	        return compteSaved;
	    }
	    
	    public Compte updateCompte(Compte compte) {
	        Compte compteUpdated=compteRepos.save(compte);
	        return compteUpdated;
	    }
	    
	    public void deleteCompte(Long id) {
	        compteRepos.deleteById(id);
	    }

}
