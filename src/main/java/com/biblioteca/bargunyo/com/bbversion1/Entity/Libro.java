package com.biblioteca.bargunyo.com.bbversion1.Entity;

import javax.persistence.*;

@Entity
@Table(name="table_libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BookId;

    @Column(name="Título")
    private String titulo;

    @Column(name="Autor")
    private String autor;

    @Column(name="Editorial")
    private String editorial;

    @Column(name="Año de publicación")
    private int anyoDePublicacion;

    @Column(name="Género")
    private String genero;

    @Column(name="Tipo")
    private String tipo;

    public Libro(Long id, String titulo, String autor, String editorial, int anyoDePublicacion, String genero, String tipo) {
        this.BookId = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anyoDePublicacion = anyoDePublicacion;
        this.genero = genero;
        this.tipo = tipo;
    }

    public Libro(Long id) {
        this.BookId = id;
    }

    public Libro (){

    }

    public Long getBookId() {
        return BookId;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAnyoDePublicacion() {
        return anyoDePublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setBookId(Long bookId) {
        this.BookId = bookId;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAnyoDePublicacion(int anyoDePublicacion) {
        this.anyoDePublicacion = anyoDePublicacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
