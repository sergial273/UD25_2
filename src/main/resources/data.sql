DROP table IF EXISTS `empleados`;
DROP TABLE IF EXISTS `departamentos`;



CREATE TABLE `departamentos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `presupuesto` int(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `empleados` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dni` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `apellido` varchar(250) DEFAULT NULL,
  `departamento` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `departamento_fk` FOREIGN KEY (`departamento`) REFERENCES `departamentos` (`id`) on delete cascade on update cascade
);

-- Para la tabla `departamentos`
INSERT INTO `departamentos` (nombre, presupuesto) VALUES
('Departamento 1', 10000),
('Departamento 2', 15000),
('Departamento 3', 12000),
('Departamento 4', 20000),
('Departamento 5', 18000);

-- Para la tabla `empleados`
INSERT INTO `empleados` (dni, nombre, apellido, departamento) VALUES
(11111111, 'Empleado 1', 'Apellido 1', 1),
(22222222, 'Empleado 2', 'Apellido 2', 2),
(33333333, 'Empleado 3', 'Apellido 3', 3),
(44444444, 'Empleado 4', 'Apellido 4', 4),
(55555555, 'Empleado 5', 'Apellido 5', 5);




