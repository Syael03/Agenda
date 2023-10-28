/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;
import java.util.Scanner;
/**
 *
 * @author S.YAEL
 */
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        while(true){
            agenda.mostrarmenu();
            System.out.print("Selecciona una opción, por favor:");
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    agenda.RegistrarContacto();
                    break;
                case 2:
                    agenda.BuscarContacto();
                    break;
                case 3:
                    agenda.EliminarContacto();
                    break;
                case 4:
                    agenda.ModificarContacto();
                    break;
                case 5:
                    System.out.println("Salida del programa");
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Opción no válida.\n Inténtalo de nuevo.");
            }
        }
    }
}
