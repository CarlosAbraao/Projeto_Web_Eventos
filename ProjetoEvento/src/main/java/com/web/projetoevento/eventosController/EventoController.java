package com.web.projetoevento.eventosController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
	
	
	@RequestMapping("/cadastraEvento")
	public String form() {
		
		return "evento/formEvento";
	}

}
