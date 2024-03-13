package com.proyecto.gym.demo.DAO;

import java.util.List;

import com.proyecto.gym.demo.domain.Empleado;

public interface EmpleadoDAOInterface extends GenericDAOInterface<Empleado, Integer> {

	List<Empleado> findByNombre(String nombre);
	List<Empleado> findByNombre();
}
