-- Inserts para la tabla Empleado
INSERT INTO Empleado (nombre, cargo, id_gimnasio) VALUES ('Juan', 'Encargado', 1);
INSERT INTO Empleado (nombre, cargo, id_gimnasio) VALUES ('María', 'Monitor', 2);

-- Inserts para la tabla Actividad
INSERT INTO Actividad (nombre, descripcion) VALUES ('Zumba', 'Clase de baile aeróbico');
INSERT INTO Actividad (nombre, descripcion) VALUES ('Spinning', 'Clase de ciclismo indoor');

-- Inserts para la tabla Clase
INSERT INTO Clase (id_empleado, id_actividad, hora_inicio, hora_fin, fecha) VALUES (1, 1, '10:00', '11:00', '2024-03-12');
INSERT INTO Clase (id_empleado, id_actividad, hora_inicio, hora_fin, fecha) VALUES (2, 2, '11:00', '12:00', '2024-03-12');

-- Inserts para la tabla Cliente
INSERT INTO Cliente (nombre, correo_electronico) VALUES ('Pedro', 'pedro@example.com');
INSERT INTO Cliente (nombre, correo_electronico) VALUES ('Laura', 'laura@example.com');

-- Inserts para la tabla Curso
INSERT INTO Curso (año) VALUES (2024);
INSERT INTO Curso (año) VALUES (2025);

-- Inserts para la tabla Gimnasio
INSERT INTO Gimnasio (nombre, direccion) VALUES ('GymFit', 'Calle Principal 123');
INSERT INTO Gimnasio (nombre, direccion) VALUES ('PowerGym', 'Avenida Central 456');
