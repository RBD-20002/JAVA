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


}
