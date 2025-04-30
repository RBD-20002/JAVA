import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            if(!Files.exists(MetodosFichero.archivo)) {
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
                InfoMenus.menu();
                System.out.println("ELIGE UNA OPCION: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion){
                    case 1:
                        MetodosFichero.agregarUsuario();
                        break;
                    case 2:
                        MetodosFichero.mostrarUsuario();
                        break;
                    case 3:
                        MetodosFichero.buscarUsuario();
                        break;
                    case 4:
                        System.out.println("Hasta Luego.....");
                        break;
                    default:
                        System.out.println("Opcion Invalida");

                }
            }catch (NumberFormatException e){
                System.out.println("ERROR: dato introducido invalido");
                opcion = -1;
            }
        }while(opcion != 4);
    }
}