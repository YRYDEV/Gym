package com.proyecto.gym.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//CREATE TABLE Empleado (
//id INT PRIMARY KEY AUTO_INCREMENT,
//nombre VARCHAR(255),
//tipo_empleado ENUM('Encargado', 'Monitor'),
//gimnasio_id INT,
//FOREIGN KEY (gimnasio_id) REFERENCES Gimnasio(id)
//);


//aqui van las namesquerys
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = " no se que poner aqui")
	@Column(name= "id")
	private Integer id;
	
	@Column(name= "nombre")
	private String nombre;
	
	@Column(name= "tipo_empleado")
	private Integer tipo_empleado; // Encargado o monitor
	
	@Column(name= "gimnasio_id")
	private Gimnasio gimnasio_id;

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
