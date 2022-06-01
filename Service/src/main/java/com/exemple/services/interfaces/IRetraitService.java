package com.exemple.services.interfaces;

import java.util.Collection;
import java.util.Optional;
import com.exemple.Retrait;

public interface IRetraitService {
		
	public Collection<Retrait> getAllRetraits();
    
    public Optional<Retrait> getRetraitById(Long id);
     
    public Collection<Retrait> getRetraitByCompte(Long id);
    
    public Retrait addRetrait(Retrait retrait);
    
    public Retrait updateRetrait(Retrait retrait);
    
    public void deleteRetrait(Long id);
	

}
