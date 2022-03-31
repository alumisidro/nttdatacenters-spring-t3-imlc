package com.isidro.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isidro.ejercicio3.entity.ClienteEntity;
import com.isidro.ejercicio3.repository.ClienteRepository;

/**
 * Indicar que es un servicio
 *
 * Ejemplo: Indicar que es un destornillador para que se meta en la caja de herramientas
 */
@Service
public class ClienteServiceImpl implements IClienteService {

	/**
	 * Se podría usar aquí el @Autowired para
	 * indicar que se va a usar ese destornillador,
	 * pero por buenas prácticas se ha hecho en el constructor.
	 * 
	 * Se puede omitir el constructor si se usa el @Autowired.
	 */
	ClienteRepository clienteRepository;
	
	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	// Buscar por nombre
	@Override
	public List<ClienteEntity> buscarPorNombre(String nombre) {
		return this.clienteRepository.findByNombre(nombre);
	}
	
	// Buscar por apellidos
	@Override
	public List<ClienteEntity> buscarPorApellidos(String apellidos) {
		return this.clienteRepository.findByApellidos(apellidos);
	}
	
	// Buscar por nombre y apellidos
	@Override
	public List<ClienteEntity> buscarPorNombreApellidos(String nombre, String apellidos) {
		return this.clienteRepository.findByNombreAndApellidos(nombre, apellidos);
	}
	
	// Insertar
	@Override
	public void insertar(ClienteEntity cliente) {
		
		this.clienteRepository.save(cliente);
		
	}

	// Obtener todos los clientes
	@Override
	public List<ClienteEntity> mostrarTodo() {
		return this.clienteRepository.findAll();
	}

	
}
