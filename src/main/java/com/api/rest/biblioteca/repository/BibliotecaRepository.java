package com.api.rest.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rest.biblioteca.entity.Biblioteca;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Integer>{

}
