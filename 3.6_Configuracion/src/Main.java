import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = -1;
        do{
            try{
                InfoMenu.menu1();
                System.out.println("INTRODUCE UNA OPCION: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion){
                    case 1 -> MetodosFichero.crearFichero();
                    case 2 -> MetodosFichero.mostrarPropiedades();
                    case 3 -> MetodosFichero.modificarConfiguracion();
                    case 4 -> MetodosFichero.mostralHistorial();
                    case 5 -> System.out.println("HASTA LUEGO......");
                    default -> System.out.println("OPCION INVALIDA");
                }
            }catch (NumberFormatException e){
                System.out.println("ERROR: DATO INTRODUCIDO INVALIDO");
            }
        }while (opcion != 5);
    }
}