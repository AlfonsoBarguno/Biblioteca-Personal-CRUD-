package com.biblioteca.bargunyo.com.bbversion1.service;

import com.biblioteca.bargunyo.com.bbversion1.Entity.Libro;
import com.biblioteca.bargunyo.com.bbversion1.converter.LibroConverter;
import com.biblioteca.bargunyo.com.bbversion1.dto.LibroDto;
import com.biblioteca.bargunyo.com.bbversion1.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements ILibroService{

    @Autowired
    LibroRepository libroRepository;

    @Autowired
    LibroConverter libroConverter;

    @Override
    public List<LibroDto> findAll() {

        List<LibroDto> resultado = new ArrayList<LibroDto>();

        List<Libro> listDto = libroRepository.findAll();

        resultado = libroConverter.entityToDto(listDto);

        return resultado;


    }

    @Override
    public LibroDto findById(Long id) {

        LibroDto resultado = new LibroDto();

        Optional<Libro> libro = libroRepository.findById(id);

        if (libro.isPresent()) {

            resultado = libroConverter.entityToDto(libro.get());
        }




        return resultado;
    }

    @Override
    public Long save(LibroDto libroDto) {

        Libro lb = libroConverter.dtoToEntity(libroDto);

        lb = libroRepository.save(lb);

        return lb.getBookId();
    }

    @Override
    public void deleteById(Long id) {

        libroRepository.deleteById(id);

    }
}
