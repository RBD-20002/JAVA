import java.io.*;
import java.util.Scanner;

public class metodos {
    static Scanner sc = new Scanner(System.in);

    public static String leerNombre(Scanner sc){
        while(true){
            System.out.println("Introduce el nombre: ");
            String dato = sc.nextLine();
            if(!dato.isBlank()) return dato;
            else System.out.println("el dato no puede estar en blanco");
        }
    }

    public static String leerCiudad(Scanner sc){
        while(true){
            System.out.println("Introduce el nombre de la ciudad: ");
            String dato = sc.nextLine();
            if(!dato.isBlank()) return dato;
            else System.out.println("el dato no puede estar en blanco");
        }
    }

    public static int leerEntero(Scanner sc){
        while(true) {
            try {
                int dato = Integer.parseInt(sc.nextLine());
                if (dato > 0) return dato;
                else System.out.println("la edad es invalida");
            } catch (NumberFormatException e) {
                System.out.println("ERRO: DATO INVALIDO");
            }
        }
    }

    public static void menu(){
        System.out.println("""
                USUARIOS
                1. Añadir usuario
                2. Mostrar todos los usuarios
                3. Buscar usuario por nombre
                4.salir
                """
        );
    }

    public static void agregarUsuario(){
        String nombre = leerNombre(sc);
        System.out.println("Introduce la edad: ");
        int edad = leerEntero(sc);
        String ciudad = leerCiudad(sc);

        try(FileWriter escribe = new FileWriter("datos.txt",true)){
            escribe.write(nombre+"|"+edad+"|"+ciudad+"\n");
        }catch (IOException e){
            System.out.println("ERROR AL ESCRIBIR EN EL FICHERO ");
        }
    }

    public static void mostrarUsuario(){
        try(BufferedReader lee = new BufferedReader(new FileReader("datos.txt"))){
            String linea;
            System.out.println("USUARIOS");

            boolean ficheroVacio = true;
            while((linea = lee.readLine()) != null){
                ficheroVacio = false;
                String[] datos = linea.split("\\|");
                System.out.println("Nombre: " + datos[0] + " | Edad: " + datos[1] + " | Ciudad: " + datos[2]);
            }

            if(ficheroVacio) System.out.println("EL FICHERO ESTA VACIO");
        }catch (IOException e){
            System.out.println("ERROR AL LEER EL FICHERO");
        }
    }

    public static void buscarUsuario(){
        System.out.println("Introduce el nombre a buscar: ");
        String busqueda = sc.nextLine();

        boolean encontrado;

        try(BufferedReader lee = new BufferedReader(new FileReader("datos.txt"))){
            String linea;
            while((linea = lee.readLine()) != null){
                String[] datos = linea.split("\\|");
                String nombre = datos[0];

                if(nombre.equalsIgnoreCase(busqueda)) System.out.println("Nombre: " + datos[0] + " | Edad: " + datos[1] + " | Ciudad: " + datos[2]);
            }
        }catch (IOException e){
            System.out.println("ERROR AL LEER EL FICHERO");
        }
    }
}
