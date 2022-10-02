package com.biblioteca.bargunyo.com.bbversion1.repository;

import com.biblioteca.bargunyo.com.bbversion1.Entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository <Libro, Long> {
}
