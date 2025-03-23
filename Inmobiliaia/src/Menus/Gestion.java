package Menus;

import Clientes.Cliente;
import Inmueble.Inmueble;

import java.util.LinkedList;
import java.util.Scanner;

public class Gestion {

    LinkedList<Cliente> clientes = new LinkedList<>();
    LinkedList<Inmueble> inmuebles = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    public void menu1() {
        System.out.println("|-----INMOBILIARIA-----|");
        System.out.println("|1. Registrar inmueble |");
        System.out.println("|2. Mostrar inmuebles  |"); /*H*/
        System.out.println("|3. Cambiar estado     |"); /*H*/
        System.out.println("|4. Eliminar inmueble  |"); /*H*/
        System.out.println("|5. Mostrar historial  |");
        System.out.println("|0. Salir              |"); /*H*/
    }

    public void menu2() {
        System.out.println("|----ESTADOS----|");
        System.out.println("|1. Disponible  |"); /*H*/
        System.out.println("|2. Vendido     |"); /*H*/
        System.out.println("|3. Alquilado   |"); /*H*/
        System.out.println("|4. Cancelar    |"); /*H*/
    }

    public void vacio() {
        if (inmuebles.isEmpty()) {
            System.out.println("No hay inmuebles");
        }
    }

    public void mostrarInmuebles() {
        vacio();
        for (int i = 0; i < inmuebles.size(); i++) {
            System.out.println((i + 1) + " " + inmuebles.get(i).toString());
        }
    }

    public void eliminarInmueble() {
        vacio();
        mostrarInmuebles();

        int indice = -1;
        boolean indiceValido = false;
        while (!indiceValido) {
            try {
                System.out.println("Eligi cual eliminar: ");
                indice = Integer.parseInt(sc.nextLine());
                if (indice >= 1 && indice <= inmuebles.size()) {
                    indiceValido = true;
                } else System.out.println("Opcion invalida debe ser entre 1 y " + inmuebles.size());
            } catch (NumberFormatException e) {
                System.out.println("ERROR: opcion invalida");
            }
            inmuebles.remove(indice - 1);
            System.out.println("Eliminado correctamente");
        }
    }

    public void cambiarEstadoInmueble() {
        vacio();
        mostrarInmuebles();

        int indice = -1;
        boolean indiceValido = false;

        while (!indiceValido) {
            try {
                System.out.println("Elige el inmueble: ");
                indice = Integer.parseInt(sc.nextLine());
                if (indice >= 1 && indice <= inmuebles.size()) {
                    indiceValido = true;
                } else System.out.println("Opcion invalida, debe ser entre 1 y " + inmuebles.size());
            } catch (NumberFormatException e) {
                System.out.println("ERROR: opcion invalido");
            }
        }
        elegirEstado(indice - 1);
    }

    private void elegirEstado(int indice) {
        Inmueble elegido = inmuebles.get(indice - 1);
        int opcion;

        do {
            menu2();
            try {
                System.out.println("Elige el nuevo estado: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1 -> inmuebles.get(indice).setEstado(Inmueble.Estado.DISPONIBLE);
                    case 2 -> inmuebles.get(indice).setEstado(Inmueble.Estado.VENDIDO);
                    case 3 -> inmuebles.get(indice).setEstado(Inmueble.Estado.ALQUILADO);
                    default -> System.out.println("Opcion invalida");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Intenta denuevo");
                opcion = 0;
            }
        } while (opcion != 4);
    }

    private double leerPrecio() {

        boolean precioValido = false;
        double precio = 0;

        while (!precioValido) {
            try {
                System.out.println("Introduce el precio: ");
                precio = Double.parseDouble(sc.nextLine());
                if (precio < 1) {
                    precioValido = true;
                } else System.out.println("Precio invalido");
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Dato invalido");
            }
        }
        return precio;
    }

    private String leerDireccion() {
        while (true) {
            System.out.println("Introduce la direccion: ");
            String direccion = sc.nextLine();
            if (!direccion.isBlank()) {
                return direccion;
            } else System.out.println("La direccion no puede estar vacia");
        }
    }

}
