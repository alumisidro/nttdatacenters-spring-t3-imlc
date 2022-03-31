package com.isidro.ejercicio3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isidro.ejercicio3.entities.ClienteEntity;
import com.isidro.ejercicio3.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public List<ClienteEntity> buscarPorNombre(String nombre, String apellidos) {
		List<ClienteEntity> listaClientes = clienteRepository.findByNombreAndApellidos(nombre, apellidos);
		return listaClientes;
	}

	@Override
	public void insertar(ClienteEntity cliente) {
		
		clienteRepository.save(cliente);
		
	}

	
}
