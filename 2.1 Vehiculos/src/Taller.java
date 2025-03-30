import Vehiculos.Bicicleta;
import Vehiculos.Camion;
import Vehiculos.Coche;
import Vehiculos.Vehiculo;

import java.util.ArrayList;

public class Taller {

    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public void anadirVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void repararVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Coche)
                System.out.println("El coche de la marca " + vehiculo.getMarca() + " y del modelo " + vehiculo.getModelo() + " se esta reparando");
            else if (vehiculo instanceof Camion)
                System.out.println("El camion de carga maxima de " + ((Camion) vehiculo).getCargaMax() + " esta en repacion");
            else if (vehiculo instanceof Bicicleta)
                System.out.println("La bicicleta " + (((Bicicleta) vehiculo).getTipo()) + " esta en mantenimiento");
            else System.out.println("No se encuentra ese tipo de vehiculo");
        }
    }
}
