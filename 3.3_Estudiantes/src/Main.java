import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            if(!Files.exists(MetodosFichero.archivo)) {
                Files.createFile(MetodosFichero.archivo);
                System.out.println("El archivo se creo con exito");
            } else {
                System.out.println("El archivo ya exite");
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
