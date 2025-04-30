import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class MetodosFichero {

    static Path archivo = Paths.get("3.2_Logs","Historial_Logs.txt");
    static Scanner sc = new Scanner(System.in);

    public static void registrarEvento(String evento){
        try{
            String nombre = leerNombre(sc);
            LocalDateTime fecha = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String fechaRegistro = fecha.format(formato);

            String contenido = "["+fechaRegistro+"] "+evento+" -> Usuario: "+nombre+System.lineSeparator();
            Files.write(archivo,contenido.getBytes(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            System.out.println("Evento registrado");
        }catch (IOException e){
            System.out.println("ERROR: fallo al escribir en el archivo");
        }
    }

    public static void mostrarHistorial() {
        try{
            List<String> lineas = Files.readAllLines(archivo);
            System.out.println("HISTORIAL: ");
            for(String linea : lineas){
                System.out.println(linea);
            }
        }catch (IOException e){
            System.out.println("ERROR: fallo al leer el archivo");
        }
    }

    public static String leerNombre(Scanner sc){
        while(true){
            System.out.println("Introduce el nombre del usuario: ");
            String nombre = sc.nextLine();
            if(!nombre.isBlank()) return nombre;
            else System.out.println("El nombre no puede estar en blanco");
        }
    }
}
