USE estudiantes;

-- Haciendo el CRUD

-- Listar estudiantes
SELECT * FROM estudiantes2022;
-- Listar columnas seleccionadas
SELECT email, telefono FROM estudiantes2022;
-- Agregar estudiante
INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES ('Maxi','Chalo', '2915271717', 'mchalin@gmail.com');
-- Modificar estudiante
UPDATE estudiantes2022 SET nombre='Maximiliano', apellido='Chalin' WHERE idestudiantes2022=1 ;
-- Eliminar estudiante
DELETE FROM estudiantes2022 WHERE idestudiantes2022=6;
-- Resetear contador de auto increment
ALTER TABLE estudiantes2022 AUTO_INCREMENT = 1;