-- Creación de la tabla Empleado
CREATE TABLE Empleado (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    tipo_empleado ENUM('Encargado', 'Monitor'),
    gimnasio_id INT,
    FOREIGN KEY (gimnasio_id) REFERENCES Gimnasio(id)
);

-- Creación de la tabla Actividad
CREATE TABLE Actividad (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    curso_id INT,
    FOREIGN KEY (curso_id) REFERENCES Curso(id)
);

-- Creación de la tabla Clase
CREATE TABLE Clase (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    monitor_id INT,
    actividad_id INT,
    FOREIGN KEY (monitor_id) REFERENCES Empleado(id),
    FOREIGN KEY (actividad_id) REFERENCES Actividad(id)
);

-- Creación de la tabla Cliente
CREATE TABLE Cliente (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    clase_id INT,
    FOREIGN KEY (clase_id) REFERENCES Clase(id)
);

-- Creación de la tabla Curso
CREATE TABLE Curso (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    gimnasio_id INT,
    FOREIGN KEY (gimnasio_id) REFERENCES Gimnasio(id)
);

-- Creación de la tabla Gimnasio
CREATE TABLE Gimnasio (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    direccion VARCHAR(255)
);
