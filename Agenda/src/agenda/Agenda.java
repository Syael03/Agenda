/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author S.YAEL
 */
public class Agenda {
   private ArrayList<Contacto> cont;

    public Agenda(){
        cont = new ArrayList<>();
    }

    public void mostrarmenu(){
        System.out.println("Menu");
        System.out.println("1. Registrar un contacto");
        System.out.println("2. Buscar un contacto");
        System.out.println("3. Eliminar un contacto");
        System.out.println("4. Modificar un contacto");
        System.out.println("5. Salir");
    }

    public void RegistrarContacto(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String correo = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Fecha de cumpleaños: ");
        String cumpleaños = scanner.nextLine();

        Contacto nuevoContacto = new Contacto(nombre, apellido, telefono, correo, direccion, cumpleaños);
        cont.add(nuevoContacto);

        System.out.println("Contacto registrado con éxito.");
    }

    public void BuscarContacto(){
        System.out.println("Listado de Contactos");
        for (int i = 0; i < cont.size(); i++) {
            Contacto contacto = cont.get(i);
            System.out.println((i + 1) + ". " + contacto.Nombre() + " " + contacto.Apellido());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecciona un contacto (desde 1 hasta" + cont.size() + "): ");
        int seleccion = scanner.nextInt();
        if (seleccion >= 1 && seleccion <= cont.size()) {
            Contacto contactoSeleccionado = cont.get(seleccion - 1);
            contactoSeleccionado.mostrarContacto();
            } else{
            System.out.println("Selección incorrecta.");
        }
    }

    public void EliminarContacto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eliminar Contacto");
        System.out.print("Selecciona un contacto a eliminar (desde 1 hasta" + cont.size() + "): ");
        int seleccion = scanner.nextInt();
        if (seleccion >= 1 && seleccion <= cont.size()) {
            Contacto contactoEliminado = cont.remove(seleccion - 1);
            System.out.println("Contacto fue eliminado con éxito: " + contactoEliminado.Nombre() + " " + contactoEliminado.Apellido());
            } else{
            System.out.println("Selección incorrecta.");
        }
    }

    public void ModificarContacto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modificar Contacto");
        System.out.print("Selecciona un contacto a modificar (desde 1 hasta" + cont.size() + "): ");
        int seleccion = scanner.nextInt();
        if (seleccion >= 1 && seleccion <= cont.size()) {
            Contacto contactomodificar = cont.get(seleccion - 1);
            System.out.println("Modificar el contacto seleccionado:");
            contactomodificar.mostrarContacto();
            System.out.println("Ingresa los nuevos datos:");
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            System.out.print("Apellido: ");
            String apellido = scanner.next();
            System.out.print("Teléfono: ");
            String telefono = scanner.next();
            System.out.print("Correo electrónico: ");
            String correo = scanner.next();
            System.out.print("Dirección: ");
            String direccion = scanner.next();
            System.out.print("Fecha de cumpleaños: ");
            String cumpleaños = scanner.next();
            contactomodificar = new Contacto(nombre, apellido, telefono, correo, direccion, cumpleaños);
            cont.set(seleccion - 1, contactomodificar);
            
            System.out.println("Contacto modificado.");
            } else{
            System.out.println("Selección incorrecta.");
        }
    }
}
