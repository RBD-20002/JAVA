import Figuras.Circulo;
import Figuras.Figura;
import Figuras.Rectangulo;
import Figuras.Triangulo;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Figura> figuras = new LinkedList<>();

        Triangulo t1 = new Triangulo(15, 10);
        Rectangulo r1 = new Rectangulo(9, 8);
        Circulo c1 = new Circulo(5);

        figuras.add(t1);
        figuras.add(r1);
        figuras.add(c1);

        System.out.println(t1.calcularArea());
        System.out.println("-".repeat(20));
        System.out.println(r1.calcularArea());
        System.out.println("-".repeat(20));
        System.out.println(c1.calcularArea());
    }
}