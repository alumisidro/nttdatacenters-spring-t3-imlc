package com.isidro.ejercicio3;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isidro.ejercicio3.entity.ClienteEntity;
import com.isidro.ejercicio3.service.ClienteServiceImpl;

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
		cliente.setDni("123456789");
		// cliente.setFechaNacimiento(new Date(1990,12,30));
		
		// Crear cliente 2
		ClienteEntity cliente2 = new ClienteEntity();
		cliente2.setNombre("Isidro");
		cliente2.setApellidos("Camarena");
		cliente2.setDni("987654321");
		
		// Insertar clientes
		clienteServicio.insertar(cliente);
		clienteServicio.insertar(cliente2);
		
		// Buscar clientes
		List<ClienteEntity> listaClientes = clienteServicio.mostrarTodo();
		// List<ClienteEntity> listaClientesNombre = clienteServicio.buscarPorNombre("Isidro");
		// List<ClienteEntity> listaClientesApellidos = clienteServicio.buscarPorApellidos("Linares");
		// List<ClienteEntity> listaClientesNombreApellidos = clienteServicio.buscarPorNombreApellidos("Isidro", "Linares");
		
		// Mostrar por consola
		System.out.println("Clientes encontrados: ");
		
		for(ClienteEntity client : listaClientes) {
			System.out.println(
					client.getNombre() + " " +
					client.getApellidos() + " "
				);
		}
	}

}
