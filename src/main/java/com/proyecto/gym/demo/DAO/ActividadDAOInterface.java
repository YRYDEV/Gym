package com.proyecto.gym.demo.DAO;

import java.util.List;

import com.proyecto.gym.demo.domain.Actividad;

public interface ActividadDAOInterface extends GenericDAOInterface<Actividad, Integer> {

	List<Actividad> findByNombre(String nombre);
	List<Actividad> findbyAll();
	
}
