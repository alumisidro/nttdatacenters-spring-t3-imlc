package com.isidro.ejercicio3.services;

import java.util.List;

import com.isidro.ejercicio3.entities.ClienteEntity;

public interface IClienteService {

	List<ClienteEntity> findByNombreAndApellidos(String nombre, String apellidos);
	
}
