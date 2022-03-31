package com.isidro.ejercicio3.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isidro.ejercicio3.entities.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

	public List<ClienteEntity> findByNombre(String nombre);
	public List<ClienteEntity> findByApellidos(String apellidos);
	public List<ClienteEntity> findByNombreAndApellidos(String nombre, String apellidos);
}
