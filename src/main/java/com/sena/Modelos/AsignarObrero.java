
package com.sena.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AsignarObrero {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAsignarObrero;

	@ManyToOne
	@JoinColumn(name = "idObra")
	private Obras obras;

	@ManyToOne
	@JoinColumn(name = "idObrero")
	private Obreros obreros;

	public AsignarObrero() {
		// TODO Auto-generated constructor stub
	}

	public AsignarObrero(int idAsignarObrero, Obras obras, Obreros obreros) {
		super();
		this.idAsignarObrero = idAsignarObrero;
		this.obras = obras;
		this.obreros = obreros;
	}

	public int getIdAsignarObrero() {
		return idAsignarObrero;
	}

	public void setIdAsignarObrero(int idAsignarObrero) {
		this.idAsignarObrero = idAsignarObrero;
	}

	public Obras getObras() {
		return obras;
	}

	public void setObras(Obras obras) {
		this.obras = obras;
	}

	public Obreros getObreros() {
		return obreros;
	}

	public void setObreros(Obreros obreros) {
		this.obreros = obreros;
	}

}
