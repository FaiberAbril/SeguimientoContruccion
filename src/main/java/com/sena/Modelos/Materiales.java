package com.sena.Modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Materiales")
public class Materiales {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idMaterial;

	@Column(length = 50)
	private String NombreMat;

	@Column(length = 3)
	private String Cantidad;

	@Enumerated(EnumType.STRING)
	private CategoriaMaterial categoria; 

	@Enumerated(EnumType.STRING)
	private TipoMaterial tipo;

	public Materiales() {
		// TODO Auto-generated constructor stub
	}

	public Materiales(int idMaterial, String nombreMat, String cantidad, CategoriaMaterial categoria,
			TipoMaterial tipo) {
		super();
		this.idMaterial = idMaterial;
		NombreMat = nombreMat;
		Cantidad = cantidad;
		this.categoria = categoria;
		this.tipo = tipo;
	}

	public int getIdMaterial() {
		return idMaterial;
	}

	public void setIdMaterial(int idMaterial) {
		this.idMaterial = idMaterial;
	}

	public String getNombreMat() {
		return NombreMat;
	}

	public void setNombreMat(String nombreMat) {
		NombreMat = nombreMat;
	}

	public String getCantidad() {
		return Cantidad;
	}

	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}

	public CategoriaMaterial getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaMaterial categoria) {
		this.categoria = categoria;
	}

	public TipoMaterial getTipo() {
		return tipo;
	}

	public void setTipo(TipoMaterial tipo) {
		this.tipo = tipo;
	}

}