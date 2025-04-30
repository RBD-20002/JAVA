import Vehiculos.Bicicleta;
import Vehiculos.Camion;
import Vehiculos.Coche;
import Vehiculos.Motor;

public class Main {
    public static void main(String[] args) {
        Taller t = new Taller();

        Motor m1 = new Motor(70, 120.50);
        Coche c1 = new Coche("Toyota", "Prius", 4, m1);
        t.anadirVehiculo(c1);
        System.out.println(c1);
        System.out.println("-".repeat(30));

        Motor m2 = new Motor(80, 200);
        Camion c2 = new Camion("Caterpila", "t-200", 10000, m2);
        t.anadirVehiculo(c2);
        System.out.println(c2);
        System.out.println("-".repeat(30));

        Bicicleta c3 = new Bicicleta("Stinzon", "520", Bicicleta.Tipo.MONTANA);
        t.anadirVehiculo(c3);
        System.out.println(c3);
        System.out.println("-".repeat(30));

        t.repararVehiculos();
    }
}