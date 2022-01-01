package com.utp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "year", nullable = false)
	private Integer year;
	@Column(name = "periodo", length = 40, nullable = false)
	private String periodo;
	@Column(name = "nivel", length = 40, nullable = false)
	private String nivel;
	@Column(name = "fecha", length = 40, nullable = false)
	private String fecha;
	@ManyToOne
	@JoinColumn(name = "fk_idestudiante", nullable = false, foreignKey = @ForeignKey(name = "matricula_estudiante"))
	private Estudiante idEstudiante;
	@ManyToOne
	@JoinColumn(name = "fk_idprograma", nullable = false, foreignKey = @ForeignKey(name = "matricula_programa"))
	private Programa idPrograma;
	
	public Matricula() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Estudiante getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(Estudiante idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public Programa getIdPrograma() {
		return idPrograma;
	}

	public void setIdPrograma(Programa idPrograma) {
		this.idPrograma = idPrograma;
	}
	
	
	

}
