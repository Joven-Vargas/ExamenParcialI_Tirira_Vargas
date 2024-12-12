/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
public class Libro implements Disponibilidad {
    private int id;
    private String  titulo;
    private String autor;
    private boolean disponible;
    

    public Libro() {
        this.disponible = true; 
    }

    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + '}';
    }

   @Override
    public boolean disponibilidad() {
        return disponible; 
    }

    @Override
    public void marcarDisponible() {
        this.disponible = true; 
    }

    @Override
    public void marcarNoDisponible() {
        this.disponible = false; 
    }
}
    

