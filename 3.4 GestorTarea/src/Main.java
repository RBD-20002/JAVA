import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File tareas = new File("tareas.txt");
        MetodosFile.validarFile(tareas);
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            try {
                InfoMenu.menu();
                System.out.println("ELIGE UNA OPCION: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        GestionFile.agregarTarea(sc);
                        break;
                    case 2:
                        GestionFile.listarTareas();
                        break;
                    case 3:
                        GestionFile.eliminarTarea(sc);
                        break;
                    case 4:
                        GestionFile.crearCopiaSeguridad();
                        break;
                    case 5:
                        System.out.println("HASTA LUEGO ......");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: fallo inesperado");
                opcion = -1;
            }
        } while (opcion != 5);
    }
}