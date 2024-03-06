package com.sena.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sena.Modelos.Diccionario;
import com.sena.Servicios.DiccionarioServicio;

@Controller
@RequestMapping("/Diccionario")
public class DiccionarioControlador {

	@Autowired
	private DiccionarioServicio diccionarioServicio;

	@GetMapping("/index")
	public String inicio() {
		return "index";
	}

	@GetMapping("/indexDiccionario")
	public String index(Model model) {
		model.addAttribute("listaDiccionario", diccionarioServicio.listaDiccionario());
		return "indexDiccionario";
	}

	@GetMapping("/DiccionarioIngreso")
	public String DiccionarioIngreso(Model model) {
		model.addAttribute("listaDiccionario", diccionarioServicio.listaDiccionario());
		model.addAttribute("ObjDiccionarios", new Diccionario());
		return "DiccionarioIngreso";
		
	}
	@GetMapping("/BuscarDiccionario")
	public String buscarDiccionario(@RequestParam("termino") String termino, Model model) {
	    List<Diccionario> resultados = diccionarioServicio.buscarPorTermino(termino);
	    model.addAttribute("listaDiccionario", resultados);
	    return "indexDiccionario";
	}
    @PostMapping("/GuardarDiccionario")
	public String guardarDiccionario(@ModelAttribute("ObjDiccionarios") Diccionario nuevoDiccionario) {
		diccionarioServicio.crearDiccionario(nuevoDiccionario); 
		return "redirect:/Diccionario/indexDiccionario";
	}

	@GetMapping("/EliminarDiccionario/{idDiccionario}")
	public String eliminarDiccionario(@PathVariable("idDiccionario") int idDiccionario) {
		diccionarioServicio.eliminarDiccionario(idDiccionario);
		return "redirect:/Diccionario/indexDiccionario";
	}

	@GetMapping("/ActualizarDiccionario/{idDiccionario}")
	public String buscarObrero(Model model, @PathVariable("idDiccionario") int idDiccionario) {
		model.addAttribute("ObjDiccionarios", diccionarioServicio.buscarporidDiccionario(idDiccionario));
		return "ActualizarDiccionario";
	}

	@PostMapping("/ActualizarDiccionario")
	public String actualizarDiccionario(@ModelAttribute("idDiccionario") Diccionario objetoactualizado) {
		diccionarioServicio.actualizarDiccionario(objetoactualizado);
		return "redirect:/Diccionario/indexDiccionario";
	}

}
