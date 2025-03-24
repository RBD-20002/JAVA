package Creacion;
import Inmuebles.Inmueble;
import Inmuebles.Piso;
import java.util.ArrayList;
import java.util.Arrays;

public class CrearPiso extends Creacioninmueble<Piso> {

    private ArrayList<String> letras = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
    public Piso crearPiso() {
        System.out.println("Ingresa los datos del piso: ");
        Inmueble datosComun = leerDatosComun();

        System.out.println("Ingresa la altura del piso: ");
        double altura = leerAltura();

        System.out.println("Ingresa la letra de la puerta: ");
        String puerta = leerPuerta();

        return new Piso(datosComun.getmCuadrados(),datosComun.getNumHabit(),datosComun.isGaraje(),datosComun.getDireccion(),altura,puerta);
    }

    private double leerAltura() {
        while(true) {
            try {
                System.out.println("Introduce la altura del pìso: ");
                double altura = Double.parseDouble(sc.nextLine());
                if(altura > 2) return altura;
                else System.out.println("Altura invalida");
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Dato invalido");
            }
        }
    }

    private String leerPuerta() {
        String letra = sc.nextLine();
        while(!letra.contains((CharSequence) letras)) {
            System.out.println("Introduce la letra de la puerta: ");
            letra = sc.nextLine();
        }
        return letra;
    }
}
