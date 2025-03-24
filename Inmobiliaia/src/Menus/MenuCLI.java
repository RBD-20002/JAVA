package Menus;

import java.util.Scanner;

public class MenuCLI {
    Scanner sc = new Scanner(System.in);
    Gestion gest = new Gestion();

    public void Iniciar() {
        int opcion;
        do {
            try {
                Gestion.menu1();
                System.out.println("Introduce opcion: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1 -> gest.registrarInmueble();
                    case 2 -> gest.mostrarInmuebles();
                    case 3 -> gest.cambiarEstadoInmueble();
                    case 4 -> gest.eliminarInmueble();
                    default -> System.out.println("Opcion invalida");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Dato invalido");
                opcion = -1;
            }
        } while (opcion != 0);
    }
}
