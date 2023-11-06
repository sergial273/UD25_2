package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentoDAO;
import com.example.demo.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{

	@Autowired
	IDepartamentoDAO iFabricanteDAO;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		
		return iFabricanteDAO.findAll();
	}
	
	@Override
	public Departamento guardarDepartamentos(Departamento video) {
		
		return iFabricanteDAO.save(video);
	}

	@Override
	public Departamento DepartamentoXID(Long id) {
		
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento video) {
		
		return iFabricanteDAO.save(video);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		
		iFabricanteDAO.deleteById(id);
		
	}
}

