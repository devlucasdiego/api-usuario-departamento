package com.lucas.usuariodepartamento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.usuariodepartamento.entidades.Usuario;
import com.lucas.usuariodepartamento.repositories.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;

	@GetMapping
	public List<Usuario> findAll() {
		List<Usuario> resultado = repository.findAll();
		return resultado;
	}
}
