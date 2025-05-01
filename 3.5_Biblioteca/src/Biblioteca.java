import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    static Scanner sc = new Scanner(System.in);
    private static List<Libro> libros;
    public static final String archivo = "Biblioteca.dat";

    public Biblioteca() {
        libros = cargarLibro();
    }

    private List<Libro> cargarLibro() {
        List<Libro> listaTemporal = new ArrayList<>();
        File fichero = new File("3.5_Biblioteca",archivo);

        if(fichero.exists()){
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))){
                listaTemporal = (List<Libro>) ois.readObject();
            }catch (IOException | ClassNotFoundException e){
                System.out.println("ERROR: fallo al cargar los libros");
            }
        }
        return listaTemporal;
    }

    private static void guardarLibros() {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(libros);
        }catch (IOException e){
            System.out.println("ERROR: fallo al guardar libros");
        }
    }

    public static void agregarLibro() {
        String codigo = leerDato("codigo");
        String titulo = leerDato("titulo");
        String autor = leerDato("autor");
        int anoPub = leerAnoPub();

        Libro nuevo = new Libro(codigo,titulo,autor,anoPub);
        libros.add(nuevo);
    }

    public static void mostrarLibros() {
        System.out.println("LIBROS: ");
        if(libros.isEmpty()){
            System.out.println("No hay libros para mostrar");
        }else{
            for(int i=0; i<libros.size(); i++){
                System.out.println("|"+(i+1)+"| "+libros.get(i));
            }
        }
    }

    public static void eliminarLibro() {
        mostrarLibros();
        String codigoEliminar = leerDato("codigo");
        boolean eliminado = libros.removeIf(libro -> libro.getCodigo().contains(codigoEliminar));
        if(eliminado){
            guardarLibros();
            System.out.println("Libro eliminado con exito");
        }else{
            System.out.println("No se encontro el libro para eliminar");
        }
    }

    public static void buscarLibro() {
        String codigoBusqueda = leerDato("codigo");
        for(Libro libro : libros){
            if(libro.getCodigo().contains(codigoBusqueda)){
                System.out.println("Libro encontrado: "+"\n"+libro);
            }else{
                System.out.println("Libro no encontrado");
            }
        }
    }

    private static String leerDato(String tipoDato) {
        while(true){
            System.out.println("Introduce "+tipoDato+":");
            String dato = sc.nextLine();
            if(!dato.isEmpty()) return dato;
            else System.out.println("El dato no puede estar en blanco");
        }
    }

    private static int leerAnoPub() {
        while(true){
            System.out.println("Introduce el año de publicacion: ");
            int anoPub = Integer.parseInt(sc.nextLine());
            if(anoPub>1000 && anoPub< LocalDateTime.now().getYear()){
                return anoPub;
            } System.out.println("El año de publicacion es invalido");
        }
    }
}
