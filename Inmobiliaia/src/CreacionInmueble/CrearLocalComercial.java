package CreacionInmueble;

import Inmueble.Inmueble;
import Inmueble.LocalComercial;

public class CrearLocalComercial extends CrearInmueble<LocalComercial> {

    @Override
    public LocalComercial crearInmueble() {
        System.out.println("Ingresa los datos del local comercial: ");
        Inmueble datosComunes = leerDatosComun();

        System.out.println("Ingresa la zona del local: ");
        String zona = leerZona();

        System.out.println("Ingresa el metraje del local: ");
        double metraje = leerMetraje();

        return new LocalComercial(crearInmueble().getUbicacion(), crearInmueble().getPrecio(), crearInmueble().getEstado(), zona, metraje);
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

    private String leerZona() {
        while (true) {
            System.out.println("Introduce la ubicacion: ");
            String zona = sc.nextLine();
            if (!zona.isBlank()) {
                return zona;
            } else System.out.println("La ubicacion no puede estar en blanco");
        }
    }
}
