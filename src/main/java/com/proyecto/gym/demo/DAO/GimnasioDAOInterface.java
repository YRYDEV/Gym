package com.proyecto.gym.demo.DAO;

import java.util.List;

import com.proyecto.gym.demo.domain.Gimnasio;

public interface GimnasioDAOInterface extends GenericDAOInterface<Gimnasio, Integer> {

	List<Gimnasio> findByNombre(String nombre);
	List<Gimnasio> findByAll();
}
