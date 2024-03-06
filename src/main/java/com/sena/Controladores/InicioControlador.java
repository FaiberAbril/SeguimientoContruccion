package com.sena.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/PaginaInicio")
public class InicioControlador {

	@GetMapping("/Inicio")
	public String paginaprincipal() {
		return "index";
	}
}
