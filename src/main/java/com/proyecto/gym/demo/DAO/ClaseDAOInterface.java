package com.proyecto.gym.demo.DAO;

import java.util.List;

import com.proyecto.gym.demo.domain.Clase;

public interface ClaseDAOInterface extends GenericDAOInterface<Clase,Integer> {
	List<Clase> findByNombre(String nombre);
	List<Clase> findByAll();
	
}
