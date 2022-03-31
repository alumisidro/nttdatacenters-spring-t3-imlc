package com.isidro.ejercicio3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isidro.ejercicio3.services.IClienteService;

@SpringBootApplication
public class Ejercicio3imlcApplication implements CommandLineRunner {

	@Autowired
	IClienteService clienteServicio;
	
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio3imlcApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		clienteServicio.findByNombreAndApellidos("Isidro", "Linares");
	}

}
