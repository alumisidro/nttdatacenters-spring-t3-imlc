package com.isidro.ejercicio3.service;

import java.util.List;

import com.isidro.ejercicio3.entity.ClienteEntity;

public interface IClienteService {

	List<ClienteEntity> buscarPorNombre(String nombre);
	List<ClienteEntity> buscarPorApellidos(String apellidos);
	List<ClienteEntity> buscarPorNombreApellidos(String nombre, String apellidos);
	List<ClienteEntity> mostrarTodo();
	void insertar(ClienteEntity cliente);
}
