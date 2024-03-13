package com.proyecto.gym.demo.Dto;


/*
 * El patrón DTO tiene como finalidad de crear un objeto plano (POJO)
 * con una serie de atributos que puedan ser enviados o recuperados del servidor en una sola invocación, 
 * de tal forma que un DTO puede contener información de múltiples fuentes o tablas y concentrarlas en una única clase simple.
 */

public class GimnasioDto {

	private Integer id;
	private String nombre;
	private String direccion;
	
	public GimnasioDto(Integer id, String nombre, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public GimnasioDto() {
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
