package com.proyecto.gym.demo.Dto;

import com.proyecto.gym.demo.domain.Actividad;
import com.proyecto.gym.demo.domain.Empleado;

/*
 * El patrón DTO tiene como finalidad de crear un objeto plano (POJO)
 * con una serie de atributos que puedan ser enviados o recuperados del servidor en una sola invocación, 
 * de tal forma que un DTO puede contener información de múltiples fuentes o tablas y concentrarlas en una única clase simple.
 */
public class ClaseDto {

	private Integer id;
	private String nombre;
	private Empleado monitor_id;
	private Actividad actividad_id;
	
	public ClaseDto(Integer id, String nombre, Empleado monitor_id, Actividad actividad_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.monitor_id = monitor_id;
		this.actividad_id = actividad_id;
	}
	
	public ClaseDto() {
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

	public Empleado getMonitor_id() {
		return monitor_id;
	}

	public void setMonitor_id(Empleado monitor_id) {
		this.monitor_id = monitor_id;
	}

	public Actividad getActividad_id() {
		return actividad_id;
	}

	public void setActividad_id(Actividad actividad_id) {
		this.actividad_id = actividad_id;
	}
	
}
