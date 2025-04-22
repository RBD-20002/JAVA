import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GestionFile {

    Scanner sc = new Scanner(System.in);

    public static void validarFile(File archivo) {
        try {
            if (archivo.createNewFile()) System.out.println("El fichero " + archivo.getName() + " se creo con existo");
            else System.out.println("El fichero " + archivo.getName() + " ya existe");
        } catch (IOException e) {
            System.out.println("Error: fallo inesperado con el archivo");
        }
    }
}
