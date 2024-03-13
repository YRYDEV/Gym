package com.proyecto.gym.demo.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

//CREATE TABLE Clase (
//	    id INT PRIMARY KEY AUTO_INCREMENT,
//	    nombre VARCHAR(255),
//	    monitor_id INT,
//	    actividad_id INT,
//	    FOREIGN KEY (monitor_id) REFERENCES Empleado(id),
//	    FOREIGN KEY (actividad_id) REFERENCES Actividad(id)
//	);
public class Clase {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = " no se que poner aqui")
	@Column(name= "id")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "monitor_id", referencedColumnName = "id")
	private Empleado monitor_id;
	
	@OneToOne (cascade = CascadeType.PERSIST)
	@JoinColumn(name = "actividad_id", referencedColumnName = "id")
	private Actividad actividad_id;
}
