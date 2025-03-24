package Menus;

import Clientes.Cliente;
import CreacionInmueble.CrearCasa;
import CreacionInmueble.CrearDepartamento;
import CreacionInmueble.CrearLocalComercial;
import Inmueble.Inmueble;
import java.util.LinkedList;
import java.util.Scanner;

public class Gestion {

    LinkedList<Cliente> clientes = new LinkedList<>();
    LinkedList<Inmueble> inmuebles = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    public static void menu1() {
        System.out.println("|-----INMOBILIARIA-----|");
        System.out.println("|1. Registrar inmueble |"); /*H*/
        System.out.println("|2. Mostrar inmuebles  |"); /*H*/
        System.out.println("|3. Cambiar estado     |"); /*H*/
        System.out.println("|4. Eliminar inmueble  |"); /*H*/
        System.out.println("|5. Filtrar inmueble   |");
        System.out.println("|0. Salir              |"); /*H*/
    }

    public void menu2() {
        System.out.println("|----ESTADOS----|");
        System.out.println("|1. Disponible  |"); /*H*/
        System.out.println("|2. Vendido     |"); /*H*/
        System.out.println("|3. Alquilado   |"); /*H*/
        System.out.println("|4. Cancelar    |"); /*H*/
    }

    public void menu3() {
        System.out.println("|----TIPOS DE INMUEBLES----|");
        System.out.println("|1. Casa                   |"); /*H*/
        System.out.println("|2. Departamento           |"); /*H*/
        System.out.println("|3. Local Comercial        |"); /*H*/
        System.out.println("|0. Volver a atras         |"); /*H*/
    }

    public boolean vacio() {
        if (inmuebles.isEmpty()) {
            System.out.println("No hay inmuebles.");
            return true;
        }
        return false;
    }

    public void mostrarInmuebles() {
        if (vacio()) return;
        for (int i = 0; i < inmuebles.size(); i++) {
            System.out.println((i + 1) + " " + inmuebles.get(i).toString());
        }
    }

    public void eliminarInmueble() {
        if (vacio()) return;
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
        }
        inmuebles.remove(indice - 1);
        System.out.println("Eliminado correctamente");
    }

    public void cambiarEstadoInmueble() {
        if (vacio()) return;
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
        Inmueble elegido = inmuebles.get(indice);
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

    public void registrarInmueble() {
        System.out.println("|--ELIGE INMUEBLE A CREAR--|");
        menu3();
        int opcion = -1;
        do {
            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1: {
                        CrearCasa crearCasa = new CrearCasa();
                        Inmueble casa = crearCasa.crearInmueble();
                        inmuebles.add(casa);
                        System.out.println("Casa registrada correctamente");
                    }
                    case 2: {
                        CrearDepartamento crearDepartamento = new CrearDepartamento();
                        Inmueble departamento = crearDepartamento.crearInmueble();
                        inmuebles.add(departamento);
                        System.out.println("Departamento registrado correctamente.");
                    }
                    case 3: {
                        CrearLocalComercial crearLocalComercial = new CrearLocalComercial();
                        Inmueble localComercial = crearLocalComercial.crearInmueble();
                        inmuebles.add(localComercial);
                        System.out.println("Local comercial registrado correctamente.");
                    }
                    case 0:
                        System.out.println("Volviendo atras");
                    default:
                        System.out.println("Opcion invalida");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Dato invalido");
            }
        } while (opcion != 0);
    }
}
