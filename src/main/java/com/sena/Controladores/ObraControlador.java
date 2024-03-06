package com.sena.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sena.Modelos.Obras;
import com.sena.Servicios.ObraServicio;

@Controller
@RequestMapping("/Obra")
public class ObraControlador {

	@Autowired
	private ObraServicio ObraServicio;

	@GetMapping("/index")
	public String inicio() {
		return "index";
	}

	@GetMapping("/indexObra")
	public String index(Model model) {
		model.addAttribute("listaObras", ObraServicio.listaObras());
		return "indexObra";
	}

	@GetMapping("/ObraIngreso")
	public String ObraIngreso(Model model) {
		model.addAttribute("listaObras", ObraServicio.listaObras());
		model.addAttribute("ObjObras", new Obras());
		return "ObraIngreso";
	}

	@PostMapping("/GuardarObra")
	public String guardarObra(@ModelAttribute("ObjObras") Obras nuevoObra) {
		ObraServicio.crearObras(nuevoObra);
		return "redirect:/Obra/indexObra";
	}

	@GetMapping("/EliminarObra/{idObra}")
	public String eliminarObra(@PathVariable("idObra") int idObra) {
		ObraServicio.eliminarObras(idObra);
		return "redirect:/Obra/indexObra";
	}

	@GetMapping("/ActualizarObra/{idObra}")
	public String buscarObra(Model model, @PathVariable("idObra") int idObra) {
		model.addAttribute("ObjObras", ObraServicio.buscarporidObra(idObra));
		return "ActualizarObra";
	}

	@PostMapping("/ActualizarObra")
	public String actualizarObra(@ModelAttribute("idObra") Obras objetoactualizado) {
		ObraServicio.actualizarObras(objetoactualizado);
		return "redirect:/Obra/indexObra";
	}

}
