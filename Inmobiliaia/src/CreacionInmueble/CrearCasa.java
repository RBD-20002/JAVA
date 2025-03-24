package CreacionInmueble;
import Inmueble.Casa;
import Inmueble.Inmueble;

public class CrearCasa extends CrearInmueble<Casa> {

    @Override
    public Casa crearInmueble() {
        System.out.println("Ingresa los datos de la casa: ");
        Inmueble datosComunes = leerDatosComun();

        System.out.println("Introduce el numero de cuartos: ");
        int numCuartos = leerCuartos();

        System.out.println("Introduce el metraje: ");
        double metraje = leerMetraje();

        return new Casa(datosComunes.getUbicacion(), datosComunes.getPrecio(), datosComunes.getEstado(), numCuartos, metraje);
    }

}
