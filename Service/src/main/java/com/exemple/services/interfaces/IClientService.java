package com.exemple.services.interfaces;

import java.util.Collection;
import java.util.Optional;

import com.exemple.Client;

public interface IClientService {

	 public Collection<Client> getAllClients();
	    
	 public Optional<Client> getClientById(Long id);
	    
	 public Client addClient(Client client);
	    
	 public Client updateClient(Client client);
	    
	 public void deleteClient(Long id);
}
