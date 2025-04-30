public class Main {
    public static void main(String[] args) {

        Libro lb1 = new Libro("El Quijote", "Cervantes", 250, 84629531);
        Libro lb2 = new Libro("Cien años de soledad", "Raul Romero", 320, 6284967);

        System.out.println("-".repeat(50));

        System.out.println(lb1);

        System.out.println("-".repeat(50));

        System.out.println(lb2);

        System.out.println("-".repeat(50));

        lb1.setNumPaginas(50);
        lb2.setNumPaginas(100);


        System.out.println(lb1);

        System.out.println("-".repeat(50));

        System.out.println(lb2);
    }
}