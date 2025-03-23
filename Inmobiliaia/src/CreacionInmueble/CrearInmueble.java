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

    private double leerPrecio() {
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
}
