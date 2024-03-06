package com.sena.Modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Diccionario")
public class Diccionario {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int idDiccionario;
		
		@Column(length = 50)
		private String palabra;
		
		@Column(columnDefinition = "TEXT")
		private String significado;

		public Diccionario() {
			// TODO Auto-generated constructor stub
		}
		public Diccionario(int idDiccionario, String palabra, String significado) {
			super();
			this.idDiccionario = idDiccionario;
			this.palabra = palabra;
			this.significado = significado;
		}
		public int getIdDiccionario() {
			return idDiccionario;
		}
		public void setIdDiccionario(int idDiccionario) {
			this.idDiccionario = idDiccionario;
		}
		public String getPalabra() {
			return palabra;
		}
		public void setPalabra(String palabra) {
			this.palabra = palabra;
		}
		public String getSignificado() {
			return significado;
		}
		public void setSignificado(String significado) {
			this.significado = significado;
		}
		
		

}