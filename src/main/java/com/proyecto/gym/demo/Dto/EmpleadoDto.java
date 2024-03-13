package com.proyecto.gym.demo.Dto;

import com.proyecto.gym.demo.domain.Gimnasio;

/*
 * El patrón DTO tiene como finalidad de crear un objeto plano (POJO)
 * con una serie de atributos que puedan ser enviados o recuperados del servidor en una sola invocación, 
 * de tal forma que un DTO puede contener información de múltiples fuentes o tablas y concentrarlas en una única clase simple.
 */
public class EmpleadoDto {

	private Integer id;
	private String nombre;
	private Integer tipo_empleado;
	private Gimnasio gimnasio_id;
	
	
	
	public EmpleadoDto(Integer id, String nombre, Integer tipo_empleado, Gimnasio gimnasio_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo_empleado = tipo_empleado;
		this.gimnasio_id = gimnasio_id;
	}

	public EmpleadoDto() {
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

	public Integer getTipo_empleado() {
		return tipo_empleado;
	}

	public void setTipo_empleado(Integer tipo_empleado) {
		this.tipo_empleado = tipo_empleado;
	}

	public Gimnasio getGimnasio_id() {
		return gimnasio_id;
	}

	public void setGimnasio_id(Gimnasio gimnasio_id) {
		this.gimnasio_id = gimnasio_id;
	}

	
	
}
