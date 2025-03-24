package Creacion;
import Inmuebles.Casa;
import Inmuebles.Inmueble;

public class CrearCasa extends Creacioninmueble<Casa> {

    public Casa crearCasa() {
        System.out.println("Ingresa los datos de la casa: ");
        Inmueble datosComun = leerDatosComun();

        System.out.println("Ingresa el numero de plantas: ");
        int numPlanta = leerPlanta();

        System.out.println("¿Tiene piscina? S/N: ");
        boolean piscina = leerPiscina();

        return new Casa(datosComun.getmCuadrados(),datosComun.getNumHabit(),datosComun.isGaraje(),datosComun.getDireccion(),numPlanta,piscina);
    }

    private int leerPlanta() {
        while(true) {
            try{
                System.out.println("Introduce el numero de planta: ");
                int numPlanta = Integer.parseInt(sc.nextLine());
                if(numPlanta >= 1) return numPlanta;
                else System.out.println("Numero de planta invalido");
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Dato invalido");
            }
        }
    }

    private boolean leerPiscina() {
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
