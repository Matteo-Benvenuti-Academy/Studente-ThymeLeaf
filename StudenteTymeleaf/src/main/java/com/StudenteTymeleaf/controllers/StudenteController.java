package com.StudenteTymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.StudenteTymeleaf.dto.StudenteDto;
import com.StudenteTymeleaf.services.StudenteService;

@Controller
@RequestMapping("studente")
@EnableWebMvc
public class StudenteController {

	@Autowired
	private StudenteService service;

	@GetMapping
	public String findAll(Model model) {

		model.addAttribute("studenti", service.findAll());

		return "studenti";
	}

	@GetMapping("insert")
	public String insertForm(Model model) {
		StudenteDto studente = new StudenteDto();
		model.addAttribute("studente", studente);

		return "insertForm";
	}

	@PostMapping
	public String insert(@ModelAttribute("studente") StudenteDto objPers, Model model) {
		
		service.insert(objPers);
		
		model.addAttribute("studente", objPers);		
		return "studente";
	}
}
