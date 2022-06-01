package com.exemple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepos extends JpaRepository<Client, Long> {

}
