package com.exemple.services.implementation;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.Client;
import com.exemple.ClientRepos;
import com.exemple.services.interfaces.IClientService;

@Service
public class ClientServiceImpl implements IClientService {

	 @Autowired
	 private ClientRepos clientRepos;

	    public Collection<Client> getAllClients() {
	        Collection<Client> clients=clientRepos.findAll();
	        return clients;
	    }
	    
	    public Optional<Client> getClientById(Long id) {
	        Optional<Client> client=clientRepos.findById(id);
	        return client;
	    }
	    
	    public Client addClient(Client client) {
	    	Client clientSaved=clientRepos.save(client);
	        return clientSaved;
	    }
	    
	   
	    public Client updateClient(Client client) {
	    	Client clientUpdated=clientRepos.save(client);
	        return clientUpdated;
	    }
	    
	    public void deleteClient(Long id) {
	    	clientRepos.deleteById(id);
	    }
	   
}
