package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Departamento;
import com.example.demo.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImpl DepartamentoServideImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return DepartamentoServideImpl.listarDepartamentos();
	}
	
	@PostMapping("/departamentos")
	public Departamento salvarDepartamento(@RequestBody Departamento Departamento) {
		
		return DepartamentoServideImpl.guardarDepartamentos(Departamento);
	}
	
	@GetMapping("/departamentos/{id}")
	public Departamento DepartamentoXID(@PathVariable(name="id") Long id) {
		
		Departamento Departamento_xid= new Departamento();
		
		Departamento_xid=DepartamentoServideImpl.DepartamentoXID(id);
		
		System.out.println("Departamento XID: "+Departamento_xid);
		
		return Departamento_xid;
	}
	
	@PutMapping("/departamentos/{id}")
	public Departamento actualizarDepartamento(@PathVariable(name="id")Long id,@RequestBody Departamento Departamento) {
		
		Departamento Departamento_seleccionado= new Departamento();
		Departamento Departamento_actualizado= new Departamento();
		
		Departamento_seleccionado= DepartamentoServideImpl.DepartamentoXID(id);
		
		Departamento_seleccionado.setNombre(Departamento.getNombre());
		Departamento_seleccionado.setPresupuesto(Departamento.getPresupuesto());
		
		Departamento_actualizado = DepartamentoServideImpl.actualizarDepartamento(Departamento_seleccionado);
		
		System.out.println("El Departamento actualizado es: "+ Departamento_actualizado);
		
		return Departamento_actualizado;
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void eliminarDepartamento(@PathVariable(name="id")Long id) {
		DepartamentoServideImpl.eliminarDepartamento(id);
	}
	
}