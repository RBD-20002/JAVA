import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcion = -1;
        do{
            try{
                InfoMenu.menu();
                System.out.println("ELIGE UNA OPCION: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion){
                    case 1:
                        Biblioteca.agregarLibro();
                        break;
                    case 2:
                        Biblioteca.mostrarLibros();
                        break;
                    case 3:
                        Biblioteca.buscarLibro();
                        break;
                    case 4:
                        Biblioteca.eliminarLibro();
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
        }while (opcion != 5);
    }
}
