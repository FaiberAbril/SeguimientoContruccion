package com.sena.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Modelos.AsignarObrero;
import com.sena.Repository.AsignarObreroRepository;

@Service
public class AsignarObreroServicio {

	@Autowired
	private AsignarObreroRepository asignarObreroRepository;

	public void crearAsignarObrero(AsignarObrero ObjAsignarObrero) {
		asignarObreroRepository.save(ObjAsignarObrero);
	}

	public void actualizarAsignarObrero(AsignarObrero ObjAsignarObrero) {
		asignarObreroRepository.save(ObjAsignarObrero);
	}

	public void eliminarAsignarObrero(int idAsignarObrero) {
		asignarObreroRepository.deleteById(idAsignarObrero);
	}

	public List<AsignarObrero> listaAsignarObrero() {
		return asignarObreroRepository.findAll();
	}


	public AsignarObrero buscaridAsignarObrero(int idAsignarObrero) {
		return asignarObreroRepository.findById(idAsignarObrero).get();
	}

}
