package com.biblioteca.bargunyo.com.bbversion1.converter;

import com.biblioteca.bargunyo.com.bbversion1.Entity.Libro;
import com.biblioteca.bargunyo.com.bbversion1.dto.LibroDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LibroConverter {

    public LibroDto entityToDto (Libro libro) {

        LibroDto dto = new LibroDto();
        dto.setBookId(libro.getBookId());
        dto.setTitulo(libro.getTitulo());
        dto.setAnyoDePublicacion(libro.getAnyoDePublicacion());
        dto.setEditorial(libro.getEditorial());
        dto.setTipo(libro.getTipo());
        dto.setGenero(libro.getGenero());
        //dto.setTipusSucursal();

        return dto;
    }

    public List<LibroDto> entityToDto (List<Libro> libro){

        return libro.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
    }

    public Libro dtoToEntity (LibroDto dto) {

        Libro lb = new Libro();
        lb.setBookId(dto.getBookId());
        lb.setTitulo(dto.getTitulo());
        lb.setAutor(dto.getAutor());
        lb.setGenero(dto.getGenero());
        lb.setEditorial(dto.getEditorial());
        lb.setAnyoDePublicacion(dto.getAnyoDePublicacion());
        lb.setTipo(dto.getTipo());
        //dto.setTipusSucursal();


        return lb;
    }

    public List<Libro> dtoToEntity (List<LibroDto> dto){

        return dto.stream().map(x-> dtoToEntity(x)).collect(Collectors.toList());
    }


}
