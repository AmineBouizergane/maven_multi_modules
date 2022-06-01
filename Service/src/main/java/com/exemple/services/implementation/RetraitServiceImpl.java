package com.exemple.services.implementation;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.Compte;
import com.exemple.CompteRepos;
import com.exemple.Retrait;
import com.exemple.RetraitRepos;
import com.exemple.services.interfaces.IRetraitService;

@Service
public class RetraitServiceImpl implements IRetraitService {
	
	 @Autowired
	 private RetraitRepos retraitRepos;
	 
	 @Autowired
	 private CompteRepos compteRepos;

	    public Collection<Retrait> getAllRetraits() {
	        Collection<Retrait> retraits=retraitRepos.findAll();
	        return retraits;
	    }
	    
	    public Optional<Retrait> getRetraitById(Long id) {
	        Optional<Retrait> retrait=retraitRepos.findById(id);
	        return retrait;
	    }
	     
	    public Collection<Retrait> getRetraitByCompte(Long id) {
	    	Optional<Compte> c = compteRepos.findById(id);
	    	Collection<Retrait> retraits=retraitRepos.findByCompte(c);
	        return retraits;
	    }
	    
	    public Retrait addRetrait(Retrait retrait) {
	    	Retrait retraitSaved=retraitRepos.save(retrait);
	        return retraitSaved;
	    }
	    
	    public Retrait updateRetrait(Retrait retrait) {
	    	Retrait retraitUpdated=retraitRepos.save(retrait);
	        return retraitUpdated;
	    }
	    
	    public void deleteRetrait(Long id) {
	    	retraitRepos.deleteById(id);
	    }

}
