package com.proyecto.gym.demo.Dto;

import com.proyecto.gym.demo.domain.Curso;

/*
 * El patrón DTO tiene como finalidad de crear un objeto plano (POJO)
 * con una serie de atributos que puedan ser enviados o recuperados del servidor en una sola invocación, 
 * de tal forma que un DTO puede contener información de múltiples fuentes o tablas y concentrarlas en una única clase simple.
 */
public class ActividadDto {

	private Integer id;
	private String nombre;
	private Curso curso_id;
	
	public ActividadDto(Integer id, String nombre, Curso curso_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.curso_id = curso_id;
	}
	
	public ActividadDto() {
		super();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Curso getCurso_id() {
		return curso_id;
	}

	public void setCurso_id(Curso curso_id) {
		this.curso_id = curso_id;
	}
	
}
