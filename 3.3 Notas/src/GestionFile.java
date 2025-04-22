import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GestionFile {

    public static void registrarEstudiante(Scanner sc) {
        System.out.println("Ingresa el nuevo estudiante: ");
        String nombre = sc.nextLine();

        if (estudianteAdentro(nombre)) {
            System.out.println("El estudiante ya esta registrado");
        } else {
            try (FileWriter escribe = new FileWriter("estudiantes.txt", true)) {
                escribe.write(nombre + "\n");
                System.out.println("Estudiante registrado");
            } catch (IOException e) {
                System.out.println("ERROR fallo al escribir en el archivo");
            }
        }
    }

    public static boolean estudianteAdentro(String nombre) {
        try (BufferedReader lee = new BufferedReader(new FileReader("estudiantes.txt"))) {
            String linea;
            while ((linea = lee.readLine()) != null) {
                if (linea.equalsIgnoreCase(nombre)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR: fallo al leer el archivo");
        }
        return false;
    }

    public static void registrarNota(Scanner sc) {
        mostrarEstudiantes();
        System.out.println("Introduce un estudiante: ");
        String estudiante = sc.nextLine();

        if (!estudianteAdentro(estudiante)) {
            System.out.println("El estudiante no existe");
            return;
        }

        System.out.println("Introduce la nota: ");
        double nota = Double.parseDouble(sc.nextLine());
        if (nota < 0 || nota > 10) {
            System.out.println("Nota invalida");
            return;
        }

        String ficheroNuevo = "notas_" + estudiante + ".txt";

        try (FileWriter escribe = new FileWriter(ficheroNuevo, true)) {
            escribe.write(nota + "\n");
            System.out.println("Nota añadida");
        } catch (IOException e) {
            System.out.println("ERROR: fallo al escribir en el archivo");
        }
    }

    public static void mostrarEstudiantes() {
        try (BufferedReader lee = new BufferedReader(new FileReader("estudiantes.txt"))) {
            String linea;
            System.out.println("--------------------" + "\nEstudiantes: " + "\n--------------------");
            boolean ficheroVacio = true;

            while ((linea = lee.readLine()) != null) {
                ficheroVacio = false;
                System.out.println("-" + linea + "\n--------------------");
            }
            if (ficheroVacio) System.out.println("El fichero esta vacio");
        } catch (IOException e) {
            System.out.println("ERROR: fallo al leer el archivo");
        }
    }

    public static void mostrarNotasEstudiante(Scanner sc) {
        mostrarEstudiantes();
        System.out.println("Introduce el nombre del estudiante: ");
        String estudiante = sc.nextLine();

        if (!estudianteAdentro(estudiante)) {
            System.out.println("El estudiante no existe");
            return;
        }

        String fichero = "notas_" + estudiante + ".txt";
        System.out.println("--------------------" + "\nNotas:" + "\n--------------------");

        try (BufferedReader lee = new BufferedReader(new FileReader(fichero))) {
            String linea;
            boolean ficheroVacio = true;

            while ((linea = lee.readLine()) != null) {
                ficheroVacio = false;
                System.out.println("-nota: " + linea + "\n--------------------");
            }
            if (ficheroVacio) System.out.println("El fichero esta vacio");
        } catch (IOException e) {
            System.out.println("ERROR: fallo al leer el archivo");
        }
    }
}
