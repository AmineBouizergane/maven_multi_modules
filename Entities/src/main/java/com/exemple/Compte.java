package com.exemple;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data @NoArgsConstructor @AllArgsConstructor
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_compte;
	private Float solde;
	@ManyToOne
	private Client client;
	@OneToMany(mappedBy = "compte")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Collection<Retrait> retraits;

}
