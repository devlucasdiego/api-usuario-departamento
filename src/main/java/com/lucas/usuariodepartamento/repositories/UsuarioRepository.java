package com.lucas.usuariodepartamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.usuariodepartamento.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
