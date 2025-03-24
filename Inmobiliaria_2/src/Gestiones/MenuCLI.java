package Gestiones;

import java.util.Scanner;

public class MenuCLI {

    Scanner sc = new Scanner(System.in);
    Gestion gest = new Gestion();

    public void Iniciar() {
        int opcion;
        do {
            try {
                gest.menu1();
                System.out.println("Introduce opcion: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1 -> gest.RegistrarInmueble();
                    case 2 -> gest.PonerEnVenta();
                    case 3 -> gest.PonerEnAlquiler();
                    case 4 -> gest.ListarInmuebles();
                    case 5 -> gest.EliminarInmueble();
                    default -> System.out.println("Opcion invalida");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Opcion invalida");
                opcion = -1;
            }
        } while(opcion != 6);
    }
}
