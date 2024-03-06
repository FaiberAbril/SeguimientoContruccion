package com.sena.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Modelos.Diccionario;
import com.sena.Repository.DiccionarioRepository;

@Service
public class DiccionarioServicio {
	@Autowired
	private DiccionarioRepository diccionarioRepository;

	public void crearDiccionario(Diccionario ObjDiccionarios) {
		diccionarioRepository.save(ObjDiccionarios);
	}

	public void actualizarDiccionario(Diccionario ObjDiccionarios) {
		diccionarioRepository.save(ObjDiccionarios);
	}

	public void eliminarDiccionario(int idDiccionario) {
		diccionarioRepository.deleteById(idDiccionario);
	}

	public List<Diccionario> listaDiccionario() {
		return diccionarioRepository.findAll();
	}

	public Diccionario buscarporidDiccionario(int idDiccionario) {
		return diccionarioRepository.findById(idDiccionario).get();
	}
	public List<Diccionario> buscarPorTermino(String termino) {
        return diccionarioRepository.findByPalabraContainingIgnoreCase(termino);
    }

}
