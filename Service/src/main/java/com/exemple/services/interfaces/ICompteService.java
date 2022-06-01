package com.exemple.services.interfaces;

import java.util.Collection;
import java.util.Optional;

import com.exemple.Compte;

public interface ICompteService {
	
	public Collection<Compte> getAllComptes();
    
    public Optional<Compte> getCompteById(Long id);
    
    public Compte addCompte( Compte compte);
    
    public Compte updateCompte(Compte compte);
    
    public void deleteCompte(Long id);

}
