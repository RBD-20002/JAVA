package Creacion;
import Inmuebles.Inmueble;
import java.util.Scanner;

public abstract class Creacioninmueble<T extends Inmueble> {
    Scanner sc = new Scanner(System.in);

    protected  Inmueble leerDatosComun() {
        double metrosCuadrados = leerMetraje();
        int numcuartos = leerCuartos();
        boolean garaje = leerGaraje();
        String direccion = leerDireccion();

        return new Inmueble(metrosCuadrados,numcuartos,garaje,direccion);
    }

    private double leerMetraje() {
        while (true) {
            try {
                System.out.println("Introduce el precio: ");
                double metraje = Double.parseDouble(sc.nextLine());
                if (metraje >= 0) return metraje;
                else System.out.println("Precio invalido, vuelve a ingresar el precio");
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Dato invalido");
            }
        }
    }

    private int leerCuartos() {
        while (true) {
            try {
                System.out.println("Introduce el precio: ");
                int cuarto = Integer.parseInt(sc.nextLine());
                if (cuarto >= 1) return cuarto;
                else System.out.println("Precio invalido, vuelve a ingresar el precio");
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Dato invalido");
            }
        }
    }

    private boolean leerGaraje() {
        boolean valor = false;
        boolean entradaValida = false;

        while (!entradaValida) {
            String entrada = sc.nextLine().toUpperCase();
            if (entrada.equals("S")) {
                return true;
            } else if (entrada.equals("N")) {
                return false;
            } else System.out.println("Entrada no valida, intente de nuevo");
        }
        return valor;
    }

    private String leerDireccion() {
        while (true) {
            System.out.println("Introduce la ubicacion: ");
            String direccion = sc.nextLine();
            if (!direccion.isBlank()) {
                return direccion;
            } else System.out.println("La ubicacion no puede estar en blanco");
        }
    }
}
