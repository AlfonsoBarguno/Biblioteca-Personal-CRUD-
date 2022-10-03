package com.biblioteca.bargunyo.com.bbversion1.dto;

import java.io.Serializable;

public class LibroDto implements Serializable {

    public static final long serialVersionUID = 1L;

    private long bookId;

    private String titulo;

    private String autor;

    private String editorial;

    private int anyoDePublicacion;

    private String genero;

    private String tipo;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnyoDePublicacion() {
        return anyoDePublicacion;
    }

    public void setAnyoDePublicacion(Integer anyoDePublicacion) {
        this.anyoDePublicacion = anyoDePublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
