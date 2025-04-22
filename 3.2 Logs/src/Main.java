import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        File file = new File("Logs.txt");

        try {
            if (file.createNewFile()) System.out.println("Fichero creado: " + file.getAbsolutePath());
            else System.out.println("El fichero ya existe");
        } catch (IOException e) {
            System.out.println("ERROR: fallo al crear" + e.getMessage());
        }

        int opcion;

        do {
            try {
                System.out.println("Introduce el nombre del ususario: ");
                String nombre = sc.nextLine();
                Menus.menu();
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        Metodos.registrarEvento(nombre, "Login");
                        break;
                    case 2:
                        Metodos.registrarEvento(nombre, "Logout");
                        break;
                    case 3:
                        Metodos.registrarEvento(nombre, "Mostrar Historial");
                        Metodos.mostrarHistorial(sc);
                        break;
                    case 4:
                        System.out.println("Hasta Luego......");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: dato introducido invalido");
                opcion = -1;
            }
        } while (opcion != 4);
    }
}