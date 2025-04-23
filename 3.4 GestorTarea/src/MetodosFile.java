import java.io.File;
import java.io.IOException;

public class MetodosFile {

    public static void validarFile(File archivo) {
        try {
            if (archivo.createNewFile()) System.out.println("El fichero " + archivo.getName() + " se creo con existo");
            else System.out.println("El fichero " + archivo.getName() + " ya existe");
        } catch (IOException e) {
            System.out.println("Error: fallo inesperado con el archivo");
        }
    }
}
