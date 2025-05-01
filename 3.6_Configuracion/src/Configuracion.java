import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class Configuracion {
    static Scanner sc = new Scanner(System.in);
    private static final String archivo = "config.properties";
    private static Properties propiedades;

    public void configuracion() {
        propiedades = new Properties();
        cargarPropiedades();
    }

    private void cargarPropiedades() {
        File fichero = new File("3.6_Configuracion",archivo);

        if(!fichero.exists()) propiedadesDefault();

        try(FileInputStream fis = new FileInputStream(fichero)){
            propiedades.load(fis);
        }catch (IOException e){
            System.out.println("ERROR: fallo al cargar las propiedades");
        }
    }

    public static void propiedadesDefault() {
        propiedades.setProperty("idioma","español");
        propiedades.setProperty("tema","claro");
        propiedades.setProperty("tamaño_fuente","14");
        propiedades.setProperty("mostrar_titurial","true");

        guardarPropiedades();
    }

    public static void guardarPropiedades() {
        try(FileOutputStream fos = new FileOutputStream(archivo)){
            propiedades.store(fos,"Configuracion de la aplicacion");
        }catch (IOException e){
            System.out.println("ERROR: al guardar la configuracion");
        }
    }

    public static void mostrarPropiedades() {
        propiedadesDefault();
        System.out.println("CONFIGURACION ACTUAL: ");
        for(Map.Entry<Object, Object> config : propiedades.entrySet()) {
            String clave = config.getKey().toString();
            String valor = config.getValue().toString();
            System.out.println(clave+" : "+valor);
        }
    }

    public static void restaurarConfiguracion() {
          propiedadesDefault();
        System.out.println("Propiedades con valores por defecto");
    }

    public static void modificarPropiedades() {
        mostrarPropiedades();
        System.out.println("ELIGE QUE VAS A MODIFICAR: ");
        String clave = sc.nextLine();
        if(propiedades.containsKey(clave)){
            System.out.println("DA EL NUEVO VALOR: ");
            String valor = sc.nextLine();
            propiedades.setProperty(clave,valor);
            guardarPropiedades();
            System.out.println("Configuracion modificadas");
        }else{
            System.out.println("La clave que introduciste no existe");
        }
    }
}