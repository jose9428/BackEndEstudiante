package com.utp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "programa")
public class Programa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nombre", length = 40, nullable = false)
	private String nombre;
	@Column(name = "semestres", nullable = false)
	private Integer semestres;
	@Column(name = "titulo", length = 40, nullable = false)
	private String titulo;
	@Column(name = "creditos", nullable = false)
	private Integer creditos;
	@Column(name = "registros", length = 40, nullable = false)
	private String registros;
	
	
	public Programa() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getSemestres() {
		return semestres;
	}
	public void setSemestres(Integer semestres) {
		this.semestres = semestres;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getCreditos() {
		return creditos;
	}
	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}
	public String getRegistros() {
		return registros;
	}
	public void setRegistros(String registros) {
		this.registros = registros;
	}
	
	
	

}
