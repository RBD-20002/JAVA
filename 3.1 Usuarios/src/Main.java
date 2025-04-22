import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("datos.txt");
        try {
            if (file.createNewFile()) System.out.println("FICHERO CREADO " + file.getAbsolutePath());
            else System.out.println("EL FICHERO YA EXISTE");
        } catch (IOException e) {
            System.out.println("ERROR AL CREAR EL FICHERO");
        }

        int opcion;
        do{
            try{
                metodos.menu();
                System.out.println("ELIGE UNA OPCION");
                opcion = metodos.leerEntero(sc);
                switch (opcion){
                    case 1:
                        metodos.agregarUsuario();
                        break;
                    case 2:
                        metodos.mostrarUsuario();
                        break;
                    case 3:
                        metodos.buscarUsuario();
                        break;
                    case 4:
                        System.out.println("ADIOS");
                        break;
                    default:
                        System.out.println("OPCION INVALIDA");
                }
            }catch (NumberFormatException e){
                System.out.println("ERROR DATO INVALIDO");
                opcion = -1;
            }
        }while(opcion != 4);
    }
}