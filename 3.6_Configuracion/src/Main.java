import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        do{
            try{
                InfoMenu.menu();
                System.out.println("ELIGE UNA OPCION: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion){
                    case 1:
                        Configuracion.mostrarPropiedades();
                        break;
                    case 2:
                        Configuracion.modificarPropiedades();
                        break;
                    case 3:
                        Configuracion.restaurarConfiguracion();
                        break;
                    case 4:
                        System.out.println("Hasta Luego......");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            }catch (NumberFormatException e){
                System.out.println("ERROR: dato introducido es invalido");
            }
        }while (opcion != 4);
    }
}
