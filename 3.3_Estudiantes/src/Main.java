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
                        MetodosFichero.registrarEstudiante();
                        break;
                    case 2:
                        MetodosFichero.anadirNota();
                        break;
                    case 3:
                        MetodosFichero.mostrarNotaEstudiante();
                        break;
                    case 4:
                        MetodosFichero.todoEstudiante();
                        break;
                    case 5:
                        System.out.println("Hasta Luego.....");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            }catch (NumberFormatException e){
                System.out.println("ERROR: dato introducido invalido");
            }
        }while(opcion != 5);
    }
}
