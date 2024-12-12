/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
public class Persona {
    
    private String Cedula;
    private String Nombre;
    private String Apellido;
   
    private String Ciudad;
    
    public Persona(){
     
}

    public Persona(String Cedula, String Nombre, String Apellido, String Ciudad) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Ciudad = Ciudad;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" + "Cedula=" + Cedula + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Ciudad=" + Ciudad + '}';
    }
    
    
    
    
    }
