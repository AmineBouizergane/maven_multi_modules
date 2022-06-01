package com.exemple.controllers;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.Client;
import com.exemple.services.interfaces.IClientService;

@RestController
public class ClientController {

	 @Autowired
	 private IClientService clientService;

	    @GetMapping("/clients")
	    public Collection<Client> getAllClients() {
	        Collection<Client> clients=clientService.getAllClients();
	        return clients;
	    }
	    
	    @GetMapping("/clients/{id}")
	    public Optional<Client> getClientById(@PathVariable Long id) {
	        Optional<Client> client=clientService.getClientById(id);
	        return client;
	    }
	    
	    @PostMapping("/clients")
	    public Client addClient(@RequestBody Client client) {
	    	Client clientSaved=clientService.addClient(client);
	        return clientSaved;
	    }
	    
	    @PutMapping("/clients")
	    public Client updateClient(@RequestBody Client client) {
	    	Client clientUpdated=clientService.updateClient(client);
	        return clientUpdated;
	    }
	    
	    @DeleteMapping("/clients/{id}")
	    public void deleteClient(@PathVariable Long id) {
	    	clientService.deleteClient(id);
	    }
	   
}
