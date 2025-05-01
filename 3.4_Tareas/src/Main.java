import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            if(!Files.notExists(MetodosFichero.archivo)){
                Files.createFile(MetodosFichero.archivo);
                System.out.println("El archivo se creo con exito");
            }else{
                System.out.println("El archivo ya existe");
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
                        MetodosFichero.anadirTarea();
                        break;
                    case 2:
                        MetodosFichero.mostrarTareas();
                        break;
                    case 3:
                        MetodosFichero.eliminarTarea();
                        break;
                    case 4:
                        MetodosFichero.crearCopiaSeguridad();
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
