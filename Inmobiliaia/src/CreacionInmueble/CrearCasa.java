package CreacionInmueble;

import Inmueble.Casa;
import Inmueble.Inmueble;

public class CrearCasa extends CrearInmueble<Casa> {

    @Override
    public Casa crearInmueble() {
        System.out.println("Ingresa los datos de la casa: ");
        Inmueble datosComunes = leerDatosComun();

        System.out.println("Introduce el numero de cuartos: ");
        int numCuartos = leerCuatos();

        System.out.println("Introduce el metraje: ");
        double metraje = Double.parseDouble(sc.nextLine());

        return new Casa(datosComunes.getUbicacion(), datosComunes.getPrecio(), datosComunes.getEstado(), numCuartos, metraje);
    }

    private int leerCuatos() {
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
}
