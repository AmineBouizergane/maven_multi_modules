package com.exemple;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_client;
	private String nom;
	private String prenom;
	private String cin;
	@OneToMany(mappedBy = "client")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Collection<Compte> comptes;
}
