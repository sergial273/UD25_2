package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	IEmpleadoDAO iFabricanteDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		
		return iFabricanteDAO.findAll();
	}
	
	@Override
	public Empleado guardarEmpleados(Empleado video) {
		
		return iFabricanteDAO.save(video);
	}

	@Override
	public Empleado EmpleadoXID(Long id) {
		
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado video) {
		
		return iFabricanteDAO.save(video);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		iFabricanteDAO.deleteById(id);
		
	}
}