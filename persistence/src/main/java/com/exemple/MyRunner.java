package com.exemple;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	private ClientRepos clientRepos;
	@Autowired
	private CompteRepos compteRepos;
	@Autowired
	private RetraitRepos retraitRepos;
	
	Random r = new Random();

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Client client1=clientRepos.save(new Client(null,"Amine","Bouiz","BH346703",null));
		Client client2=clientRepos.save(new Client(null,"Yasser","Zakaria","BH346703",null));
		Client client3=clientRepos.save(new Client(null,"Mehdi","Wahbi","BH346703",null));
		
		Compte compte1=compteRepos.save(new Compte(null,3000f,client1,null));
		Compte compte2=compteRepos.save(new Compte(null,2000f,client2,null));
		Compte compte3=compteRepos.save(new Compte(null,5000f,client3,null));
		
		retraitRepos.save(new Retrait(null,new Date(),r.nextInt(3000-100) + 100,compte1));
		retraitRepos.save(new Retrait(null,new Date(),r.nextInt(3000-100) + 100,compte1));
		retraitRepos.save(new Retrait(null,new Date(),r.nextInt(3000-100) + 100,compte1));
		
		retraitRepos.save(new Retrait(null,new Date(),r.nextInt(3000-100) + 100,compte2));
		retraitRepos.save(new Retrait(null,new Date(),r.nextInt(3000-100) + 100,compte2));
		retraitRepos.save(new Retrait(null,new Date(),r.nextInt(3000-100) + 100,compte2));
		
		retraitRepos.save(new Retrait(null,new Date(),r.nextInt(3000-100) + 100,compte3));
		retraitRepos.save(new Retrait(null,new Date(),r.nextInt(3000-100) + 100,compte3));
		retraitRepos.save(new Retrait(null,new Date(),r.nextInt(3000-100) + 100,compte3));

	}
}
