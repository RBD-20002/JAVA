import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IO;
import java.io.IOException;
import java.util.Properties;

public class MetodosFichero {

    public MetodosFichero() {
        Properties propiedades = new Properties();
        try(FileInputStream fis = new FileInputStream("Configuracion.properties")){

        }catch (IOException e){
            System.out.println("ERROR: FALLO AL CREAR EL FICHERO");
        }
    }

    public static void crearFichero(){

    }

    public static void mostrarPropiedades(){

    }

    public static void modificarConfiguracion() {

    }

    public static void mostralHistorial() {

    }
}
