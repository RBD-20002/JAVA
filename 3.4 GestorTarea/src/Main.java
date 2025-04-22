import java.io.File;

public class Main {
    public static void main(String[] args) {

        File tareas = new File("tareas.txt");
        GestionFile.validarFile(tareas);

    }
}