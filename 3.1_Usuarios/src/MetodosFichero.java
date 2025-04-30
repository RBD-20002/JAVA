import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class MetodosFichero {

    static Path archivo = Paths.get("3.1_Usuarios","users.txt");
    static Scanner sc = new Scanner(System.in);

    public static void agregarUsuario() {
        try{
            System.out.println("Introdue el nombre del Usuario: ");
            String nombre = MetodosFichero.leerDato(sc);
            System.out.println("Introduce la ciudad del Usuario: ");
            String ciudad = MetodosFichero.leerDato(sc);
            int edad = MetodosFichero.leerEdad(sc);

            String contenido = nombre +","+edad+","+ciudad+System.lineSeparator();
            Files.write(archivo,contenido.getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            System.out.println("Contenido escrito en el archivo");
        } catch (Exception e) {
            System.out.println("ERROR: fallo al escribir en el fichero");
        }
    }

    public static void mostrarUsuario() {
        try {
            List<String> lineas = Files.readAllLines(archivo);
            System.out.println("USUARIOS: ");
            for(String linea : lineas){
                System.out.println(linea);
            }
        }catch (IOException e){
            System.out.println("ERROR: fallo al leer el archivo");
        }
    }

    public static void buscarUsuario() {
        try{
            System.out.println("Introduce el usuario a buscar: ");
            String usuarioBuscar = sc.nextLine();

            List<String> lineas = Files.readAllLines(archivo);
            boolean encontrado = false;

            for(String linea : lineas){
                if(linea.contains(usuarioBuscar)){
                    System.out.println("Coincidencia encontrada:"+"\n"+linea);
                    encontrado = true;
                } else {
                    System.out.println("Coincidencia no encantrada");
                }
            }

        }catch (IOException e){
            System.out.println("ERROR: fallo al leer el archivo");
        }
    }

    public static String leerDato(Scanner sc) {
        while(true){
            String dato = sc.nextLine();
            if(!dato.isEmpty()) return dato;
            else System.out.println("El nombre no puede estar en blanco");
        }
    }

    public static int leerEdad(Scanner sc) {
        while(true){
            try{
                System.out.println("Introduce la edad del Usuario: ");
                int edad = Integer.parseInt(sc.nextLine());
                if(edad >= 18) return edad;
                else System.out.println("La edad del usuario no puede ser menor de 18");
            }catch (NumberFormatException e){
                System.out.println("ERROR: el dato introducido es invalido ");
            }
        }
    }
}
