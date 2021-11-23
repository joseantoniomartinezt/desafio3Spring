package com.everis.desafio3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.everis.spring.repositories.Cliente;
import com.everis.spring.services.BuscarNombreApellidos;

@SpringBootApplication
public class Desafio3Application implements CommandLineRunner{
	
	@Autowired
	private BuscarNombreApellidos buscarNombreService;
	
	@Autowired
	private Cliente cliente;

	public static void main(String[] args) {
		SpringApplication.run(Desafio3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(buscarNombreService.findByNombreAndApellidos(cliente.getNombre(), cliente.getApellidos()));
		
	}

}
