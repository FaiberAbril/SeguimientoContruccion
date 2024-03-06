package com.sena.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sena.Modelos.Obreros;
import com.sena.Servicios.ObreroServicio;

@Controller
@RequestMapping("/Obrero")
public class ObreroControlador {

	@Autowired
	private ObreroServicio obreroServicio;

	@GetMapping("/index")
	public String inicio() {
		return "index";
	}

	@GetMapping("/indexObrero")
	public String index(Model model) {
		model.addAttribute("listaObreros", obreroServicio.listaObreros());
		return "indexObrero";
	}

	@GetMapping("/ObreroIngreso")
	public String ObreroIngreso(Model model) {
		model.addAttribute("listaObreros", obreroServicio.listaObreros());
	    model.addAttribute("ObjObreros", new Obreros());
	    return "ObreroIngreso";
	}

    @PostMapping("/GuardarObrero")
	public String guardarObrero(@ModelAttribute("ObjObreros") Obreros nuevoObrero) {
		obreroServicio.crearObreros(nuevoObrero);
		return "redirect:/Obrero/indexObrero";
	}

	@GetMapping("/EliminarObrero/{idObrero}")
	public String eliminarObrero(@PathVariable("idObrero") int idObrero) {
		obreroServicio.eliminarObreros(idObrero);
		return "redirect:/Obrero/indexObrero";
	}

	@GetMapping("/ActualizarObrero/{idObrero}")
	public String buscarObrero(Model model, @PathVariable("idObrero") int idObrero) {
		model.addAttribute("ObjObreros", obreroServicio.buscarporidObrero(idObrero));
		return "ActualizarObrero";
	}

	@PostMapping("/ActualizarObrero")
	public String actualizarObrero(@ModelAttribute("idObrero") Obreros objetoactualizado) {
		obreroServicio.actualizarObreros(objetoactualizado);
		return "redirect:/Obrero/indexObrero";
	}
	

}
