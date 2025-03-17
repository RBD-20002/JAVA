import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Double> Areas = new HashMap<>();
        HashMap<String,Double> Perimetro = new HashMap<>();

        Triangulo tr = new Triangulo(12.5,8.5);
        Rectangulo re = new Rectangulo(10,5);
        Circulo ci = new Circulo(7.5);

        Areas.put("Circulo", tr.calcularArea());
        Areas.put("Rectangulo",re.calcularArea());
        Areas.put("Triangulo", tr.calcularArea());

        Perimetro.put("Circulo", ci.calcularPerimetro());
        Perimetro.put("Rectangulo", re.calcularPerimetro());
        Perimetro.put("Triangulo", tr.calcularPerimetro());

        for(String figura : Areas.keySet()) {
            System.out.println("Area de: "+figura+":"+Areas.get(figura));
        }
        for(String figura : Perimetro.keySet()) {
            System.out.println("Perimetro de :"+figura+":"+Perimetro.get(figura));
        }
    }
}
