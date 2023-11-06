package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="empleados")//en caso que la tabla sea diferente

public class Empleado {
	
	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "dni")//no hace falta si se llama igual
		private int dni;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		@Column(name = "apellido")//no hace falta si se llama igual
		private String apellidos;
		
		@ManyToOne
	    @JoinColumn(name="departamento")
	    private Departamento departamento;

		//Constructores
		public Empleado() {
			
		}

		public Empleado(Long id, int dni, String nombre, String apellidos, Departamento departamento) {
			this.id = id;
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.departamento = departamento;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public int getDni() {
			return dni;
		}

		public void setDni(int dni) {
			this.dni = dni;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public Departamento getDepartamento() {
			return departamento;
		}

		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}

		@Override
		public String toString() {
			return "Empleado [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos
					+ ", departamento=" + departamento + "]";
		}
		
		
}