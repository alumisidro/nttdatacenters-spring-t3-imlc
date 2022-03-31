package com.isidro.ejercicio3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isidro.ejercicio3.entities.ClienteEntity;
import com.isidro.ejercicio3.services.ClienteServiceImpl;

@SpringBootApplication
public class Ejercicio3imlcApplication implements CommandLineRunner {

	@Autowired
	ClienteServiceImpl clienteServicio;
	
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio3imlcApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		// Crear cliente
		ClienteEntity cliente = new ClienteEntity();
		cliente.setNombre("Isidro");
		cliente.setApellidos("Linares");
		// Insertar
		clienteServicio.insertar(cliente);
		
		// Buscar clientes
		List<ClienteEntity> listaClientes = clienteServicio.buscarPorNombre("Isidro", "Linares");
		
		// Mostrar por consola
		System.out.println("Clientes encontrados: ");
		
		for(ClienteEntity client : listaClientes) {
			System.out.println(client.getNombre());
		}
	}

}
