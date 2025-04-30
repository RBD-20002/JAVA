import Figuras.Circulo;
import Figuras.Figura;
import Figuras.Rectangulo;
import Figuras.Triangulo;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Double> areas = new HashMap<>();
        HashMap<String, Double> perimetros = new HashMap<>();

        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(3, 4);
        Figura triangulo = new Triangulo(3, 4);

        areas.put("Circulo", circulo.calcularArea());
        areas.put("Rectangulo", rectangulo.calcularArea());
        areas.put("Triangulo", triangulo.calcularArea());

        perimetros.put("Circulo", circulo.calcularPerimetro());
        perimetros.put("Rectangulo", rectangulo.calcularPerimetro());
        perimetros.put("Triangulo", triangulo.calcularPerimetro());

        for (String figura : areas.keySet()) {
            System.out.println("Área de " + figura + ": " + areas.get(figura));
        }

        System.out.println("-".repeat(20));

        for (String figura : perimetros.keySet()) {
            System.out.println("Perímetro de " + figura + ": " + perimetros.get(figura));
        }
    }
}