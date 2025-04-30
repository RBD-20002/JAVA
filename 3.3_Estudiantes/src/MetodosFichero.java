import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Struct;
import java.util.List;
import java.util.Scanner;

public class MetodosFichero {

    static Scanner sc = new Scanner(System.in);
    static Path archivo = Paths.get("3.3_Estudiantes","estudiantes.txt");

    public static void registrarEstudiante() {
        try{
            String nuevoEstudiante = leerNombre(sc)+System.lineSeparator();
            if(existeEstudiante(nuevoEstudiante)) {
                System.out.println("El estudiante ya esta registrado");
            } else {
                Files.write(archivo,nuevoEstudiante.getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
                System.out.println("Estudiante registrado");
            }
        }catch (IOException e){
            System.out.println("ERROR: fallo al escribir en el archivo");
        }
    }

    public static void anadirNota() {
        todoEstudiante();
        System.out.println("");
    }

    public static void mostrarNotaEstudiante() {

    }

    public static void todoEstudiante() {
        try {
            List<String> estudiantes = Files.readAllLines(archivo);
            if(estudiantes.isEmpty()){
                System.out.println("No hay estudiantes registrados");
                return;
            }else{
                System.out.println("ESTUDIANTES: ");
                for(int i=0; i<estudiantes.size(); i++){
                    System.out.println((i+1)+" "+estudiantes.get(i));
                }
            }
        }catch (IOException e){
            System.out.println("ERROR: fallo al leer el archivo");
        }
    }

    public static String leerNombre(Scanner sc) {
        while(true){
            System.out.println("Introduce el nombre del estudiante: ");
            String nombre = sc.nextLine();
            if(!nombre.isBlank()) return nombre;
            else System.out.println("El nombre no puede estar en blanco");
        }
    }

    public static int leerNota(Scanner sc){
        while(true){
            try{
                System.out.println("Introduce la nota: ");
                int nota = Integer.parseInt(sc.nextLine());
                if(nota>=0 && nota<=10) return nota;
                else System.out.println("La nota es invalida");
            }catch (NumberFormatException e){
                System.out.println("ERROR: dato introducido invalido");
            }
        }
    }

    public static void crearFicheroNoExistente(String nombreFichero) {
        Path archivoRecienCreado = Paths.get(nombreFichero);
        try{
            if(Files.notExists(archivoRecienCreado)){
                Files.createFile(archivoRecienCreado);
                System.out.println("Archivo creado");
            }
        }catch (IOException e){
            System.out.println("ERROR: fallo al crear el archivo");
        }
    }

    public static boolean existeEstudiante(String nombre) {
        try{
            List<String> estudiantes = Files.readAllLines(Paths.get("estudiantes.txt"));
            for(String estudiante : estudiantes){
                if(estudiante.equalsIgnoreCase(nombre)) {
                    return true;
                }
            }
            return false;
        }catch(IOException e){
            System.out.println("ERROR: fallo al leer el archivo");
            return false;
        }
    }
}
