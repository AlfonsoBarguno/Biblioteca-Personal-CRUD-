package com.biblioteca.bargunyo.com.bbversion1.service;

import com.biblioteca.bargunyo.com.bbversion1.dto.LibroDto;

import java.util.List;

public interface ILibroService {

    public List<LibroDto> findAll();

    //public Page<SucursalDto> findAll(Pageable pageable);

    public LibroDto findById (Long id);

    public Long save(LibroDto libroDto);

    public void deleteById (Long id);
}
