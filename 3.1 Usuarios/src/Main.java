import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final String NOMBRE_FICHERO = "Usuarios.txt";

    public static void main(String[] args) {

        Gestion gt = new Gestion();
        InfoMenus info = new InfoMenus();
        Scanner sc = new Scanner(System.in);

        File fichero = new File(NOMBRE_FICHERO);
        try {
            if (fichero.createNewFile()) {
                System.out.println("El fichero ha sido creado");
            } else {
                System.out.println("El fichero ya existe");
            }
        } catch (IOException e) {
            System.out.println("ERROR: en creacion de fichero");
        }

        int opcion = -1;
        do {
            try {
                info.menu1();
                System.out.println("Introduce una opcion: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1 -> gt.registrarUsuario();
                    case 2 -> gt.mostrarUsuarios();
                    case 3 -> gt.buscarUsuario();
                    case 4 -> System.out.println("Adios");
                    default -> System.out.println("Opcion invalida");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Dato introducido invalido");
                opcion = -1;
            }
        } while (opcion != 4);

    }
}