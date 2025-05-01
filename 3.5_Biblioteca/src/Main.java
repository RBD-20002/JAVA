import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            if(!Files.notExists(MetodosFichero)){
                System.out.println("El fichero ya existe");
                return;
            }else{
                System.out.println("El fichero se creo con exito");
            }
        }catch (IOException e){
            System.out.println("ERROR: fallo al crear el archivo");
        }

        int opcion = -1;
        do{
            try{
                InfoMenu.menu();
                System.out.println("ELIGE UNA OPCION: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion){
                    case 1:
                        MetodosFichero.agregarLibro();
                        break;
                    case 2:
                        MetodosFichero.mostrarLibros();
                        break;
                    case 3:
                        MetodosFichero.buscarLibro();
                        break;
                    case 4:
                        MetodosFichero.eliminarLibro();
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
        }while (opcion != 6);
    }
}
