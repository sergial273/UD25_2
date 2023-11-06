package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Departamento;


public interface IDepartamentoService {

	//Metodos del CRUD
		public List<Departamento> listarDepartamentos(); //Listar All 
		
		public Departamento guardarDepartamentos(Departamento video);	//Guarda un Departamento CREATE
		
		public Departamento DepartamentoXID(Long id); //Leer datos de un Departamento READ
		
		public Departamento actualizarDepartamento(Departamento video); //Actualiza datos del Departamento UPDATE
		
		public void eliminarDepartamento(Long id);// Elimina el Departamento DELETE
}
