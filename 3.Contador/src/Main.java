public class Main {
    public static void main(String[] args) {

        Contador c = new Contador(10);
        Contador c1 = new Contador(5);

        c.incrementar();
        System.out.println(c.getContador());
        System.out.println("-".repeat(50));
        c1.decrementar();
        System.out.println(c1.getContador());

    }
}