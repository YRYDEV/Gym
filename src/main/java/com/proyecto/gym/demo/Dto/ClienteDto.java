package com.proyecto.gym.demo.Dto;

import com.proyecto.gym.demo.domain.Clase;

/*
 * El patrón DTO tiene como finalidad de crear un objeto plano (POJO)
 * con una serie de atributos que puedan ser enviados o recuperados del servidor en una sola invocación, 
 * de tal forma que un DTO puede contener información de múltiples fuentes o tablas y concentrarlas en una única clase simple.
 */
public class ClienteDto {

	private Integer id;
	private String nombre;
	private Clase clase_id;
	
	public ClienteDto(Integer id, String nombre, Clase clase_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clase_id = clase_id;
	}
	
	public ClienteDto() {
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

	public Clase getClase_id() {
		return clase_id;
	}

	public void setClase_id(Clase clase_id) {
		this.clase_id = clase_id;
	}
	
}
