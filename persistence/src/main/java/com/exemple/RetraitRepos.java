package com.exemple;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetraitRepos extends JpaRepository<Retrait, Long>{
	
	Collection<Retrait> findByCompte(Optional<Compte> c);

}
