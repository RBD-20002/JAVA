package CreacionInmueble;

import Inmueble.Inmueble;

import java.util.Scanner;

public abstract class CrearInmueble<T extends Inmueble> {

    Scanner sc = new Scanner(System.in);

    public abstract T crearInmueble();

    protected Inmueble leerDatosComun() {
        String ubicacion = leerUbicacion();
        double precio = leerPrecio();
        return new Inmueble(ubicacion, precio, Inmueble.Estado.DISPONIBLE);
    }

    private String leerUbicacion() {
        while (true) {
            System.out.println("Introduce la ubicacion: ");
            String ubicacion = sc.nextLine();
            if (!ubicacion.isBlank()) {
                return ubicacion;
            } else System.out.println("La ubicacion no puede estar en blanco");
        }
    }

    double leerPrecio() {
        while (true) {
            try {
                System.out.println("Introduce el precio: ");
                double precio = Double.parseDouble(sc.nextLine());
                if (precio >= 1) return precio;
                else System.out.println("Precio invalido, vuelve a ingresar el precio");
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Dato invalido");
            }
        }
    }

    int leerPiso() {
        while (true) {
            try {
                System.out.println("Introduce el precio: ");
                int piso = Integer.parseInt(sc.nextLine());
                if (piso >= 1) return piso;
                else System.out.println("Precio invalido, vuelve a ingresar el precio");
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Dato invalido");
            }
        }
    }

    boolean expensasSiNo() {
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

    double leerMetraje() {
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

    String leerZona() {
        while (true) {
            System.out.println("Introduce la ubicacion: ");
            String zona = sc.nextLine();
            if (!zona.isBlank()) {
                return zona;
            } else System.out.println("La ubicacion no puede estar en blanco");
        }
    }

    int leerCuartos() {
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
}
