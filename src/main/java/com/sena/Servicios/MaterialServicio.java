package com.sena.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Modelos.Materiales;
import com.sena.Repository.MaterialesRepository;

@Service
public class MaterialServicio {

	@Autowired
	private MaterialesRepository materialesRepository;

	public void crearMaterial(Materiales ObjMateriales) {
		materialesRepository.save(ObjMateriales);
	}

	public void actualizarMaterial(Materiales ObjMateriales) {
		materialesRepository.save(ObjMateriales);
	}

	public void eliminarMaterial(int idMaterial) {
		materialesRepository.deleteById(idMaterial);
	}

	public List<Materiales> listaMaterial() {
		return materialesRepository.findAll();
	}

	public Materiales buscarporidMaterial(int idMaterial) {
		return materialesRepository.findById(idMaterial).get();
	}

}