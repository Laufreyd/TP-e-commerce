package com.tactFactory.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tactFactory.spring.entity.Customer;
import com.tactFactory.spring.entity.Order;
import com.tactFactory.spring.entity.Product;
import com.tactFactory.spring.repository.CustomerRepository;
import com.tactFactory.spring.repository.OrderRepository;
import com.tactFactory.spring.repository.ProductRepository;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CustomerRepository cRepository, ProductRepository pRepository,OrderRepository oRepository) {
		return (args) -> {
			// save a couple of customers
			cRepository.save(new Customer("Jack", "Bauer"));
			cRepository.save(new Customer("Chloe", "O'Brian"));
			cRepository.save(new Customer("Kim", "Bauer"));
			cRepository.save(new Customer("David", "Palmer"));
			cRepository.save(new Customer("Michelle", "Dessler"));

			pRepository.save(new Product("Produit 1"));
			pRepository.save(new Product("Produit 2"));
			pRepository.save(new Product("Produit 3"));
			pRepository.save(new Product("Produit 4"));
			pRepository.save(new Product("Produit 5"));
			
			oRepository.save(new Order());
		};
	}
	
	
}
