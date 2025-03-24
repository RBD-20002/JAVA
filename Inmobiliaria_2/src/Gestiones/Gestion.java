package Gestiones;
import Inmuebles.Casa;
import Inmuebles.Inmueble;
import java.util.LinkedList;
import java.util.Scanner;

public class Gestion {

    Scanner sc = new Scanner(System.in);
    LinkedList<Inmueble> inmuebles = new LinkedList<>();

    public void menu1() {
        System.out.println("""
                |---------INMOBILIARIA---------|
                |1. Registrar Inmueble         |
                |2. Poner Inmueble en venta    |
                |3. Poner Inmueble en alquiler |
                |4. Listar Inmuebles           | /*H*/
                |5. Eliminar Inmueble          | /*H*/
                |6. Salir del programa         | /*H*/
                |------------------------------|
                """);
    }
    public void menu2() {
        System.out.println("""
                |-----CLASES INMUEBLE-----|
                |1. Casa                  |
                |2. Piso                  |
                |3. Otro                  |
                |4. Voler al menu inicial |
                |-------------------------|
                """);
    }

    public void menu3() {
        System.out.println("""
                |---ESTADOS DEL INMUEBLE---|
                |1. Alquiler               |
                |2. Venta                  |
                |--------------------------|
                """);
    }

    public boolean vacio() {
        if (inmuebles.isEmpty()) {
            System.out.println("No hay inmuebles.");
            return true;
        } return false;
    }

    public void ListarInmuebles() {
        if (vacio()) return;
        for (int i = 0; i < inmuebles.size(); i++) {
            System.out.println((i + 1) + " " + inmuebles.get(i).toString());
        }
    }

    public void EliminarInmueble() {
        if(vacio()) return;
        ListarInmuebles();

        int indice = -1;
        boolean indiceValido = false;
        while(!indiceValido) {
            try{
                System.out.println("Elige el inmueble a eliminar: ");
                indice = Integer.parseInt(sc.nextLine());
                if(indice >= 1 && indice <= inmuebles.size()) {
                    indiceValido = true;
                } else System.out.println("Opcion invalida debe estar entre el 1 y "+inmuebles.size());
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Opcion invalida");
            }
        }
        inmuebles.remove(indice -1);
        System.out.println("Inmueble eliminado correctamente");
    }

    public void RegistrarInmueble() {
        menu2();
    }

    public void PonerEnVenta() {
        menu3();
    }

    public void PonerEnAlquiler() {
        menu2();
    }
}
