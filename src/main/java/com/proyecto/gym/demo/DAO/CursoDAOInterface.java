package com.proyecto.gym.demo.DAO;



import java.util.List;

import com.proyecto.gym.demo.domain.Curso;

public interface CursoDAOInterface extends GenericDAOInterface<Curso, Integer> {

	List<Curso> findByNombre(String nombre);
	List<Curso> findByAll();
}
