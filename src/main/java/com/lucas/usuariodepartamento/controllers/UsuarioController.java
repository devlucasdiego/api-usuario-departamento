package com.lucas.usuariodepartamento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping(value = "/{id}")
	public Usuario findById(@PathVariable Long id) {
		Usuario resultado = repository.findById(id).get();
		return resultado;
	}

	@PostMapping
	public Usuario insert(@RequestBody Usuario usuario) {
		Usuario resultado = repository.save(usuario);
		return resultado;
	}

}
