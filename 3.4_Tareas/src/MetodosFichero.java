import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class MetodosFichero {

    static Scanner sc = new Scanner(System.in);
    static Path archivo = Paths.get("3.4_Tareas","Gestortareas.txt");

    public static void anadirTarea() {
        try{
            String tarea = leerDato(sc);
            String contenido = tarea+System.lineSeparator();
            Files.write(archivo,contenido.getBytes(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        }catch (IOException e){
            System.out.println("ERROR: fallo al escribir en el archivo");
        }
    }

    public static void mostrarTareas() {
        try{
            List<String> lineas = Files.readAllLines(archivo);
            if(lineas.isEmpty()) {
                System.out.println("No hay tareas para mostrar");
            }else{
                System.out.println("TAREAS: ");
                for(int i=0; i<lineas.size(); i++){
                    System.out.println("ID_"+(i+1)+" | "+lineas.get(i));
                }
            }
        }catch (IOException e){
            System.out.println("ERROR: fallo al leer el archivo");
        }
    }

    public static void eliminarTarea() {
        try{
            mostrarTareas();
            if(Files.notExists(archivo) || Files.size(archivo) == 0){
                System.out.println("No hay tareas para eliminar");
                return;
            }

            System.out.println("ELIGE LA TAREA A ELIMINAR: ");
            int seleccionado = 0;
            try{
                seleccionado = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("ERROR: dato introducido invalido");
            }

            List<String> lineas = Files.readAllLines(archivo);
            if(seleccionado<1 || seleccionado>lineas.size()){
                System.out.println("La ID es invlaida");
                return;
            }
            String tareaEliminada = lineas.remove(seleccionado-1);

            Files.write(archivo,lineas,StandardOpenOption.WRITE,StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Tarea Eliminada");
        }catch (IOException e){
            System.out.println("ERROR: fallo al modificar el archivo");
        }
    }

    public static void crearCopiaSeguridad() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm");
        String fecha = LocalDateTime.now().format(formato);

        String copiaSeguridad = "Tareas_Copia_Seguridad_"+fecha+".txt";
        Path archivoCopia = Paths.get(copiaSeguridad);

        try{
            Files.copy(archivo,archivoCopia, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copia de Seguridad creada con exito");
        }catch (IOException e){
            System.out.println("ERROR: fallo al crear la copia de seguridad");
        }
    }

    public static String leerDato(Scanner sc) {
        while(true){
            System.out.println("Introduce la nueva tarea: ");
            String dato = sc.nextLine();
            if(!dato.isBlank()) return dato;
            else System.out.println("La tarea no puede quedar en blanco");
        }
    }
}
