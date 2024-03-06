package com.sena.Servicios;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Modelos.Obras;
import com.sena.Repository.ObrasRepository;



@Service
public class ObraServicio {

	@Autowired
	private ObrasRepository obrasRepository;

	public void crearObras(Obras ObjObras) {
		obrasRepository.save(ObjObras);
	}

	public void actualizarObras(Obras ObjObras) {
		obrasRepository.save(ObjObras);
	}

	public void eliminarObras(int idObra) {
		obrasRepository.deleteById(idObra);
	}

	public List<Obras> listaObras() {
		return obrasRepository.findAll();
	}

	public Obras buscarporidObra(int idObra) {
		return obrasRepository.findById(idObra).get();
	}
}

