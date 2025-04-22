import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Metodos {

    static DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    Scanner sc = new Scanner(System.in);

    public static String leerNombre(Scanner sc) {
        while (true) {
            System.out.println("Introduce el nombre del Usuario: ");
            String nombre = sc.nextLine();
            if (!nombre.isBlank()) return nombre;
            else System.out.println("EL nombre del usuario no puede estar en blanco");
        }
    }

    public static void registrarEvento(String nombre, String tipoEvento) {
        String fecha = LocalDateTime.now().format(formato);
        String lineaLog = "[" + fecha + "] " + tipoEvento + " -> Usuario: " + nombre;
        lineaLog = "[" + fecha + "] " + tipoEvento + " -> Usuario: " + nombre;
        try (FileWriter escribir = new FileWriter("Logs.txt", true)) {
            escribir.write(lineaLog + "\n");
        } catch (IOException e) {
            System.out.println("ERROR: fallo al escribir en el archivo");
        }

    }

    public static void mostrarHistorial(Scanner sc) {
        try (BufferedReader lee = new BufferedReader(new FileReader("Logs.txt"))) {
            String linea;
            System.out.println("HISTORIAL: ");
            boolean ficheroVacio = true;

            while ((linea = lee.readLine()) != null) {
                ficheroVacio = false;
                System.out.println(linea);
            }
            if (ficheroVacio) System.out.println("El fichero esta vacio");

        } catch (IOException e) {
            System.out.println("ERROR: fallo al leer el archivo");
        }
    }
}
