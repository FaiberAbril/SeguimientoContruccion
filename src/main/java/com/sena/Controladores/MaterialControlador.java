package com.sena.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sena.Modelos.CategoriaMaterial;
import com.sena.Modelos.Materiales;
import com.sena.Modelos.TipoMaterial;
import com.sena.Servicios.MaterialServicio;

@Controller
@RequestMapping("/Material")
public class MaterialControlador {

	@Autowired
	private MaterialServicio materialServicio;

	@GetMapping("/index")
	public String inicio() {
		return "index";
	}

	@GetMapping("/indexMaterial")
	public String index(Model model) {
		model.addAttribute("listaMaterial", materialServicio.listaMaterial());
		return "indexMaterial";
	}

	@GetMapping("/MaterialIngreso")
	public String MaterialIngreso(Model model) {
		model.addAttribute("listaMaterial", materialServicio.listaMaterial());
		model.addAttribute("ObjMateriales", new Materiales());
		model.addAttribute("categorias", CategoriaMaterial.values());
		return "MaterialIngreso";
	}

	@PostMapping("/GuardarMaterial")
	public String guardarMaterial(@ModelAttribute("ObjMateriales") Materiales nuevoMaterial) {
		materialServicio.crearMaterial(nuevoMaterial);
		return "redirect:/Material/indexMaterial";
	}

	@GetMapping("/EliminarMaterial/{idMaterial}")
	public String eliminarMaterial(@PathVariable("idMaterial") int idMaterial) {
		materialServicio.eliminarMaterial(idMaterial);
		return "redirect:/Material/indexMaterial";
	}

	@GetMapping("/ActualizarMaterial/{idMaterial}")
	public String buscarMaterial(Model model, @PathVariable("idMaterial") int idMaterial) {
		model.addAttribute("ObjMateriales", materialServicio.buscarporidMaterial(idMaterial));
		return "ActualizarMaterial";
	}

	@PostMapping("/ActualizarMaterial")
	public String actualizarMaterial(@ModelAttribute("idMaterial") Materiales objetoactualizado) {
		materialServicio.actualizarMaterial(objetoactualizado);
		return "redirect:/Material/indexMaterial";
	}

	@GetMapping("/tiposPorCategoria")
    @ResponseBody
    public TipoMaterial[] getTiposPorCategoria(@RequestParam("categoria") CategoriaMaterial categoria) {
        return categoria.getTipos().toArray(new TipoMaterial[0]);
    }
}
