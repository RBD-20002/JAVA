import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GestionFile {

    Scanner sc = new Scanner(System.in);

    public static void listarTareas() {

        try (BufferedReader lee = new BufferedReader(new FileReader("tareas.txt"))) {
            if ("tareas.txt".isEmpty()) {
                System.out.println("NO HAY TAREAS PARA ELIMINAR");
                return;
            }

            String linea;
            System.out.println("----------------" + "\nTAREAS:" + "\n----------------");
            boolean ficheroVacio = true;
            int contador = 1;

            while ((linea = lee.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    ficheroVacio = false;
                    System.out.println("ID_" + contador + " | " + linea + "\n--------------------");
                    contador++;
                }
            }
            if (ficheroVacio) System.out.println("El fichero esta vacio");
        } catch (IOException e) {
            System.out.println("ERROR: fallo al leer el fichero");
        }
    }

    public static void agregarTarea(Scanner sc) {
        System.out.println("Introduce la nueva tarea: ");
        String tarea = sc.nextLine();

        try (FileWriter escribe = new FileWriter("tareas.txt", true)) {
            escribe.write(tarea + "\n");
            System.out.println("Tarea registrada");
        } catch (IOException e) {
            System.out.println("ERROR: fallo al escribir en el archivo");
        }
    }

    public static void eliminarTarea(Scanner sc) {
        File archivo = new File("tareas.txt");
        List<String> lineas = new ArrayList<>();

        listarTareas();
        System.out.println("ELIGE LA ID DE UNA TAREA: ");
        int numeroTarea = Integer.parseInt(sc.nextLine());

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {  // Ignorar líneas vacías
                    lineas.add(linea);
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR fallo al leer el archivo");
            return;
        }

        if (numeroTarea < 1 || numeroTarea > lineas.size()) {
            System.out.println("ID invalido");
            return;
        }

        String tareaEliminada = lineas.remove(numeroTarea - 1);
        System.out.println("Tarea eliminada: " + tareaEliminada);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            int i = 0;
            while (i < lineas.size()) {
                bw.write(lineas.get(i));
                if (i < lineas.size() - 1) {  // No agregar salto de línea al final
                    bw.newLine();
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println("ERROR fallo al leer el archivo");
        }
    }

    public static void crearCopiaSeguridad() {
        String fecha = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
        String copiaSeguridad = "tareas_copia_seguridad" + fecha + ".txt";

        File Original = new File("tareas.txt");
        File copia = new File(copiaSeguridad);

        try (BufferedReader lee = new BufferedReader(new FileReader(Original));
             FileWriter escribe = new FileWriter(copia)) {
            String linea;
            while ((linea = lee.readLine()) != null) {
                escribe.write(linea);
            }
            System.out.println("Copia de seguridad creada");
        } catch (IOException e) {
            System.out.println("ERROR: fallo al crear la copia de seguridad");
        }
    }
}
