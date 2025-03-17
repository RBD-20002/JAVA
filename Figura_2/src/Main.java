import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Figura> figuras = new LinkedList<>();

        Circulo ci = new Circulo(2.89);
        figuras.add(ci);

        Rectangulo re = new Rectangulo(15.20, 13);
        figuras.add(re);

        Triangulo tr = new Triangulo(5.20, 8.0);
        figuras.add(tr);

        for(Figura f : figuras){
            System.out.println("Area: "+f.calcularArea());
        }
    }
}
