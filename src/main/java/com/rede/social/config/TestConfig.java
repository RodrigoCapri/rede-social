package com.rede.social.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rede.social.entities.User;
import com.rede.social.repositories.UserRepository;

@Configuration
@Profile("h2")

//Classe que executa antes do sistema iniciar
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(null, "valdemoor", "João Medeiros", "joao@email.com", "42988884444", "000888777333", "password", Arrays.asList("img1.jpg","img2.jpg"));
		User user2 = new User(null, "darthvader", "Alex Green", "alex@email.com", "48977771111", "111333888777", "123456", Arrays.asList("img1.jpg"));
		User user3 = new User(null, "valquiria", "Maria Oliveira", "maria@email.com", "41900007777", "111222333444", "pass123", Arrays.asList("img1.jpg","img2.jpg","img3.jpg","img4.jpg"));
		
		userRepo.saveAll(Arrays.asList(user1, user2, user3));
		
	}

}
