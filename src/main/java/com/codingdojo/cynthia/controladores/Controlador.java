package com.codingdojo.cynthia.controladores;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/date")
	public String date(Model model) {
		
		Date d = new Date();
		SimpleDateFormat fecha = new SimpleDateFormat("E dd MMMM, yyyy");
		String fecha_formateada = fecha.format(d);
		
		//model.addAttribute("fecha", fecha);
		model.addAttribute("fecha", fecha_formateada);
		
		return "date.jsp";
	}
	
}
