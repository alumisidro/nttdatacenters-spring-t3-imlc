package com.isidro.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isidro.ejercicio3.entity.ClienteEntity;
import com.isidro.ejercicio3.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public List<ClienteEntity> buscarPorNombre(String nombre) {
		List<ClienteEntity> listaClientes = clienteRepository.findByNombre(nombre);
		return listaClientes;
	}
	
	@Override
	public List<ClienteEntity> buscarPorApellidos(String apellidos) {
		List<ClienteEntity> listaClientes = clienteRepository.findByApellidos(apellidos);
		return listaClientes;
	}
	
	@Override
	public List<ClienteEntity> buscarPorNombreApellidos(String nombre, String apellidos) {
		List<ClienteEntity> listaClientes = clienteRepository.findByNombreAndApellidos(nombre, apellidos);
		return listaClientes;
	}
	
	@Override
	public void insertar(ClienteEntity cliente) {
		
		clienteRepository.save(cliente);
		
	}

	@Override
	public List<ClienteEntity> mostrarTodo() {
		return clienteRepository.findAll();
	}

	
}
