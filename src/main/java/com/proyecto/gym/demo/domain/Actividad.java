package com.proyecto.gym.demo.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

//-- Creación de la tabla Actividad
//CREATE TABLE Actividad (
//    id INT PRIMARY KEY AUTO_INCREMENT,
//    nombre VARCHAR(255),
//    curso_id INT,
//    FOREIGN KEY (curso_id) REFERENCES Curso(id)
//);

//aqui van las namequerys
public class Actividad {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = " no se que poner aqui")
	@Column(name= "id")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	//un curo tiene varias actividades, y las actividades tienen un solo curso
	@ OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "curso_id", referencedColumnName = "id")
	private Curso curso_id;

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
