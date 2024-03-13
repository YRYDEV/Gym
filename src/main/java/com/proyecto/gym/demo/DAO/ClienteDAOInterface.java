package com.proyecto.gym.demo.DAO;

import java.util.List;

import com.proyecto.gym.demo.domain.Cliente;

public interface ClienteDAOInterface extends GenericDAOInterface<Cliente, Integer> {

	List<Cliente> findByNombre(String nombre);
	List<Cliente> findByAll();
	
}
