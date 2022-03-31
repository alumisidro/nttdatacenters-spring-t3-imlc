package com.isidro.ejercicio3.services;

import java.util.List;

import com.isidro.ejercicio3.entities.ClienteEntity;

public interface IClienteService {

	List<ClienteEntity> buscarPorNombre(String nombre, String apellidos);
	
	void insertar(ClienteEntity cliente);
}
