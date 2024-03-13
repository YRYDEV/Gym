package com.proyecto.gym.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
-- Creación de la tabla Gimnasio
CREATE TABLE Gimnasio (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    direccion VARCHAR(255)
);
*/
//aqui van las namequerys
public class Gimnasio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = " no se que poner aqui")
	@Column(name= "id")
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name = "direccion")
	private String direccion;

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
