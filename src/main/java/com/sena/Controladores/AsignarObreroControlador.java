package com.sena.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sena.Modelos.AsignarObrero;
import com.sena.Modelos.Obreros;
import com.sena.Servicios.AsignarObreroServicio;
import com.sena.Servicios.ObraServicio;
import com.sena.Servicios.ObreroServicio;

@Controller
@RequestMapping("/AsignarObrero")
public class AsignarObreroControlador {

	@Autowired
	private AsignarObreroServicio asignarObreroServicio;

	@Autowired
	private ObraServicio obraServicio;

	@Autowired
	private ObreroServicio obreroServicio;

	@GetMapping("/index")
	public String inicio() {
		return "index";
	}

	@GetMapping("/indexAsignarObrero")
	public String mostrarListaAsignarObrero(Model model) {
		model.addAttribute("listaAsignarObrero", asignarObreroServicio.listaAsignarObrero());
		model.addAttribute("listaObras", obraServicio.listaObras());
		model.addAttribute("listaObreros", obreroServicio.listaObreros());
		model.addAttribute("objObrero", new Obreros());
		return "indexAsignarObrero";
	}

	@PostMapping("/GuardarAsignarObrero")
	public String guardarAsignarObrero(@ModelAttribute("objAsignarObrero") AsignarObrero nuevoAsignarObrero) {
		asignarObreroServicio.crearAsignarObrero(nuevoAsignarObrero);
		return "redirect:/AsignarObrero/indexAsignarObrero";
	}

	@GetMapping("/EliminarAsignarObrero/{idAsignarObrero}")
	public String eliminarAsignarObrero(@PathVariable("idAsignarObrero") int idAsignarObrero) {
		asignarObreroServicio.eliminarAsignarObrero(idAsignarObrero);
		return "redirect:/AsignarObrero/indexAsignarObrero";
	}

	@GetMapping("/ActualizarAsignarObrero/{idAsignarObrero}")
	public String buscarAsignarObrero(Model model, @PathVariable("idAsignarObrero") int idAsignarObrero) {
		model.addAttribute("objAsignarObrero", asignarObreroServicio.buscaridAsignarObrero(idAsignarObrero));
		return "indexActualizarAsignarObrero";
	}
}
