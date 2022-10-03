package com.biblioteca.bargunyo.com.bbversion1.controller;

import com.biblioteca.bargunyo.com.bbversion1.dto.LibroDto;
import com.biblioteca.bargunyo.com.bbversion1.service.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class LibroController {

    @Autowired
    private ILibroService libroService;

    private final String DATA_LIBROSDTO_LISTA = "DATA_LibrosDtoLista";
    private final String DATA_LIBROSDTO_FORMULARIO = "DATA_LibrosDtoFormulario";

    private final String VISTA_LISTA_LIBROS = "Libros";
    private final String VISTA_CONSULTA_LIBROS = "ConsultaLibro";
    private final String VISTA_EDITA_LIBRO = "EditaLibro";


    @GetMapping("/ListaLibros")
    public ModelAndView listaLibros() {
        ModelAndView mv = new ModelAndView();
        List<LibroDto> LibrosDto = libroService.findAll();
        mv.addObject(DATA_LIBROSDTO_LISTA, LibrosDto);
        mv.setViewName(VISTA_LISTA_LIBROS);
        return mv;
    }

    @GetMapping("/NuevoLibro")
    public ModelAndView formularioNuevoLibro() {

        LibroDto libroDto = new LibroDto();

        libroDto.setTitulo(" ");
        libroDto.setAutor(" ");
        libroDto.setEditorial(" ");
        libroDto.setAnyoDePublicacion(0);
        libroDto.setGenero(" ");
        libroDto.setTipo(" ");

        return formularioLibroDTO(libroDto, VISTA_EDITA_LIBRO);

    }

    @GetMapping("/ModificaLibro/{id}")
    public ModelAndView formularioModificaLibro(@PathVariable("id") Long id) {
        LibroDto libroDto = libroService.findById(id);
        return formularioLibroDTO(libroDto, VISTA_EDITA_LIBRO);
    }

    @GetMapping("/ConsultaLibro/{id}")
    public ModelAndView formulariConsultaLibro(@PathVariable("id") Long id) {
        LibroDto libroDto = libroService.findById(id);
        return formularioLibroDTO(libroDto, VISTA_CONSULTA_LIBROS);

    }

    @GetMapping("EliminaLibro/{id}")
    public ModelAndView eliminaLibro(@PathVariable("id") Long id) {
        libroService.deleteById(id);
        return new ModelAndView("redirect:/ListaLibros");
    }

    @PostMapping("/GuardarLibro")
    public ModelAndView guardarLibro(@ModelAttribute(DATA_LIBROSDTO_FORMULARIO) LibroDto libroDto) {
        libroService.save(libroDto);
        return new ModelAndView("redirect:/ListaLibros");
    }

    private ModelAndView formularioLibroDTO(LibroDto libroDto, String nombreVista) {
        ModelAndView mv = new ModelAndView();
        mv.addObject(DATA_LIBROSDTO_FORMULARIO, libroDto);
        mv.setViewName(nombreVista);
        return mv;
    }
}
