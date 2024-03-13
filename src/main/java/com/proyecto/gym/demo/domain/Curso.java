package com.proyecto.gym.demo.domain;
//-- Creación de la tabla Curso
//CREATE TABLE Curso (
//    id INT PRIMARY KEY AUTO_INCREMENT,
//    nombre VARCHAR(255),
//    gimnasio_id INT,
//    FOREIGN KEY (gimnasio_id) REFERENCES Gimnasio(id)
//);

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

//aqui van las namequerys

public class Curso {
 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = " no se que poner aqui")
	@Column(name= "id")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "gimnasio_id", referencedColumnName = "id")
	private Gimnasio gimnasio_id;
	
	
	//Getter y Setter
	
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

	public Gimnasio getGimnasio_id() {
		return gimnasio_id;
	}

	public void setGimnasio_id(Gimnasio gimnasio_id) {
		this.gimnasio_id = gimnasio_id;
	}

	
	
}
