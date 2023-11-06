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

import com.example.demo.dto.Empleado;
import com.example.demo.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl EmpleadoServideImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return EmpleadoServideImpl.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado Empleado) {
		
		return EmpleadoServideImpl.guardarEmpleados(Empleado);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado EmpleadoXID(@PathVariable(name="id") Long id) {
		
		Empleado Empleado_xid= new Empleado();
		
		Empleado_xid=EmpleadoServideImpl.EmpleadoXID(id);
		
		System.out.println("Empleado XID: "+Empleado_xid);
		
		return Empleado_xid;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id")Long id,@RequestBody Empleado Empleado) {
		
		Empleado Empleado_seleccionado= new Empleado();
		Empleado Empleado_actualizado= new Empleado();
		
		Empleado_seleccionado= EmpleadoServideImpl.EmpleadoXID(id);
		
		Empleado_seleccionado.setNombre(Empleado.getNombre());
		Empleado_seleccionado.setApellidos(Empleado.getApellidos());
		Empleado_seleccionado.setDni(Empleado.getDni());
		Empleado_seleccionado.setDepartamento(Empleado.getDepartamento());
		
		Empleado_actualizado = EmpleadoServideImpl.actualizarEmpleado(Empleado_seleccionado);
		
		System.out.println("El Empleado actualizado es: "+ Empleado_actualizado);
		
		return Empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id")Long id) {
		EmpleadoServideImpl.eliminarEmpleado(id);
	}
	
}

