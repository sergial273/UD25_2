package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleado;


public interface IEmpleadoService {

	//Metodos del CRUD
		public List<Empleado> listarEmpleados(); //Listar All 
		
		public Empleado guardarEmpleados(Empleado video);	//Guarda un Empleado CREATE
		
		public Empleado EmpleadoXID(Long id); //Leer datos de un Empleado READ
		
		public Empleado actualizarEmpleado(Empleado video); //Actualiza datos del Empleado UPDATE
		
		public void eliminarEmpleado(Long id);// Elimina el Empleado DELETE
}
