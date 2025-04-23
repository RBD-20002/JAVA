import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        File estudiantes = new File("estudiantes.txt");
        MetodoFiles.validarFile(estudiantes);

        int opcion;
        do {
            try {
                InfoMenu.menu();
                System.out.println("ELIGE UNA OPCION: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        GestionFile.registrarEstudiante(sc);
                        break;
                    case 2:
                        GestionFile.registrarNota(sc);
                        break;
                    case 3:
                        GestionFile.mostrarNotasEstudiante(sc);
                        break;
                    case 4:
                        GestionFile.mostrarEstudiantes();
                        break;
                    case 5:
                        System.out.println("HATA LUEGO ......");
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