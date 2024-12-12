/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Autor;
import modelo.Libro;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
       
        Autor autor = new Autor();
        Libro libro = new Libro();

         
        libro.marcarDisponible();
        System.out.println("El libro '" + libro.getTitulo() + "' está disponible: " + libro.disponibilidad());

         
        libro.marcarNoDisponible();
        System.out.println("El libro '" + libro.getTitulo() + "' está disponible: " + libro.disponibilidad());
    }
}