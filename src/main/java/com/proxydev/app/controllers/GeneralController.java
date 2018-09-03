package com.proxydev.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.proxydev.app.models.entities.Usuarios;
import com.proxydev.app.models.services.UsuariosServ;

public class GeneralController {

	@Autowired
	private UsuariosServ usuariosServ;

	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo","listado de usuarios");
		model.addAttribute("usuarios", usuariosServ.findAll());
		return "listar";
	}
	
	@RequestMapping(value="/form")
	public String crear(Map<String, Object> model) {
		Usuarios usuarios = new Usuarios();
		model.put("usuarios", usuarios);
		model.put("titulo", "Formulario de cliente");
		return "form";
	}
	
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String guardar(@Valid Usuarios usuarios, BindingResult bindingResult, RedirectAttributes flash, SessionStatus sessionStatus ) {
		if(bindingResult.hasErrors()) {
			return "form";
		}
		usuariosServ.save(usuarios);
		sessionStatus.setComplete();
		
		flash.addFlashAttribute("success","Usuario agregado con exito");
		return "redirect:listar";
	}
	
	@RequestMapping(value="/form/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String, Object> model, RedirectAttributes flash) {
		Usuarios usuarios = null;
		if (id > 0) {
			usuarios = usuariosServ.findOne(id);
		}else {
			flash.addFlashAttribute("error","El Id del usuario no puede ser cero");
			return "redirect:/listar";
		}
		model.put("usuario", usuarios);
		model.put("titulo", "Editar usuario");
		
		return "form";
	}
	
	@RequestMapping(value="/eliminar/{id}")
	public String eliminar(@PathVariable(value="id") Long id, RedirectAttributes flash) {
		if (id > 0 ) {
			usuariosServ.delete(id);
		}
		flash.addFlashAttribute("success","Usuario eliminado con exito");
		return "redirect:/listar";
	}
	
	@RequestMapping(value="/ver/{id}", method=RequestMethod.GET)
	public String ver(@PathVariable(value = "id") Long id, Map<String, Object> model, RedirectAttributes flashl) {
		Usuarios usuarios = usuariosServ.findOne(id);
		if (usuarios == null) {
			flashl.addFlashAttribute("error", "El cliente no existe en la base de datos");
			return "redirect:/listar";
		}

		model.put("customers", usuarios);
		model.put("titulo", "Editar Cliente");
		return "ver";
	}
	
	
}
