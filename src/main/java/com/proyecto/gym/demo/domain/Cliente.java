package com.proyecto.gym.demo.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

//-- Creación de la tabla Cliente
//CREATE TABLE Cliente (
//    id INT PRIMARY KEY AUTO_INCREMENT,
//    nombre VARCHAR(255),
//    clase_id INT,
//    FOREIGN KEY (clase_id) REFERENCES Clase(id)
//);

//aqui van las namesquerys
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = " no se que poner aqui")
	@Column(name= "id")
	private Integer id;
	
	@Column(name= "nombre")
	private String nombre;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinColumn( name = "clase_id", referencedColumnName = "id")
	@Column(name= "clase_id")
	private Clase clase_id;

// Getter y Setter
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
