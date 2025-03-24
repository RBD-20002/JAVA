package CreacionInmueble;
import Inmueble.Departamento;
import Inmueble.Inmueble;

public class CrearDepartamento extends CrearInmueble<Departamento> {

    @Override
    public Departamento crearInmueble() {
        System.out.println("Ingresa los datos del departamento: ");
        Inmueble datosComunes = leerDatosComun();

        System.out.println("Ingresa el numero de piso: ");
        int piso = leerPiso();

        System.out.println("¿Tiene expensas? (S/N): ");
        boolean expensas = expensasSiNo();

        return new Departamento(crearInmueble().getUbicacion(), crearInmueble().getPrecio(), crearInmueble().getEstado(), piso, expensas);
    }


}
