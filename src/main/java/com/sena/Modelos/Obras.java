package com.sena.Modelos;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Obras")
public class Obras {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idObra;

	@Column(length = 50)
	private String NombreObra;

	@Column(length = 100)
	private String Descripcion;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate FechaInicio;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate FechaFinal;

	@Enumerated(EnumType.STRING)
	@Column(length = 15)
	private Estado estado;

	public Obras() {
		// TODO Auto-generated constructor stub
	}

	public Obras(int idObra, String nombreObra, String descripcion, LocalDate fechaInicio, LocalDate fechaFinal,
			Estado estado) {
		super();
		this.idObra = idObra;
		NombreObra = nombreObra;
		Descripcion = descripcion;
		FechaInicio = fechaInicio;
		FechaFinal = fechaFinal;
		this.estado = estado;
	}

	public int getIdObra() {
		return idObra;
	}

	public void setIdObra(int idObra) {
		this.idObra = idObra;
	}

	public String getNombreObra() {
		return NombreObra;
	}

	public void setNombreObra(String nombreObra) {
		NombreObra = nombreObra;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public LocalDate getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public LocalDate getFechaFinal() {
		return FechaFinal;
	}

	public void setFechaFinal(LocalDate fechaFinal) {
		FechaFinal = fechaFinal;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public enum Estado {
		En_progreso, Completado
	}
}
