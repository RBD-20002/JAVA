public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Ricardo", "c1", 10.5, 1000);
        System.out.println(c1);
        System.out.println("-".repeat(50));

        Cuenta c2 = new Cuenta("Jose", "c2", 08.5, 500);
        System.out.println(c2);
        System.out.println("-".repeat(50));

        c1.Ingreso(100);
        System.out.println(c1);
        System.out.println("-".repeat(50));

        c2.Retiro(200);
        System.out.println(c2);
        System.out.println("-".repeat(50));

        System.out.println(c1);
        c1.transferencia(c2, 200);
        System.out.println(c1);
        System.out.println("-".repeat(10));
        System.out.println(c2);
    }
}