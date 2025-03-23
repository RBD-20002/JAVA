package CreacionInmueble;

import Inmueble.Departamento;
import Inmueble.Inmueble;

public class CrearDepartamento extends CrearInmueble<Departamento> {

    @Override
    public Departamento crearInmueble() {
        System.out.println("Ingresa los datos del departamento: ");
        Inmueble datosComunes = leerDatosComun();

        System.out.println("Ingresa el numero de piso: ");
        int piso = leerpiso();

        System.out.println("¿Tiene expensas? (S/N): ");
        boolean expensas = expensasSiNo();

        return new Departamento(crearInmueble().getUbicacion(), crearInmueble().getPrecio(), crearInmueble().getEstado(), piso, expensas);
    }

    private int leerpiso() {
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

    private boolean expensasSiNo() {
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
}
