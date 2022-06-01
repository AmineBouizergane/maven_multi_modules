package com.exemple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompteRepos extends JpaRepository<Compte, Long> {

}
