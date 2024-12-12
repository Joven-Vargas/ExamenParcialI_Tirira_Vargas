/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author Tiririn
 */
public class Prestamo {
     private Persona persona;
    private Libro libro;

    public Prestamo(Persona persona, Libro libro) {
        this.persona = persona;
        this.libro = libro;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "persona=" + persona + ", libro=" + libro + '}';
    }
    
    
}
