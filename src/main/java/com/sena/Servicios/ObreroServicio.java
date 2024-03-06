package com.sena.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Modelos.Obreros;
import com.sena.Repository.ObrerosRepository;

@Service
public class ObreroServicio {

	@Autowired
	private ObrerosRepository obrerosRepository;

	public void crearObreros(Obreros ObjObreros) {
		obrerosRepository.save(ObjObreros);
	}

	public void actualizarObreros(Obreros ObjObreros) {
		obrerosRepository.save(ObjObreros);
	}

	public void eliminarObreros(int idObrero) {
		obrerosRepository.deleteById(idObrero);
	}

	public List<Obreros> listaObreros() {
		return obrerosRepository.findAll();
	}

	public Obreros buscarporidObrero(int idObrero) {
		return obrerosRepository.findById(idObrero).get();
	}

}
