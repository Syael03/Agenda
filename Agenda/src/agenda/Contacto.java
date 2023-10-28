/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author S.YAEL
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String direccion;
    private String cumpleaños;
    
    public Contacto(String nombre, String apellido, String telefono, String correo, String direccion, String cumpleaños) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.cumpleaños = cumpleaños;
    }

    public String Nombre(){
        return nombre;
    }

    public String Apellido(){
        return apellido;
    }

    public void mostrarContacto(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo electrónico: " + correo);
        System.out.println("Dirección: " + direccion);
        System.out.println("Fecha de cumpleaños: " + cumpleaños);
    }
}
