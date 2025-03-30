import Preguntas.Pregunta;
import Preguntas.PreguntaBool;
import Preguntas.PreguntaCorta;
import Preguntas.PreguntaNumerica;

public class Main {
    public static void main(String[] args) {
        PreguntaCorta pc = new PreguntaCorta("¿Hola?", "hola");
        PreguntaNumerica pn = new PreguntaNumerica("¿2+2?", 4);
        PreguntaBool pb = new PreguntaBool("¿Son las 11?", false);

        System.out.println("PREGUNTAS NO GENERICAS: ");
        System.out.println("-".repeat(50));
        System.out.println(pc);
        System.out.println("-".repeat(20));
        System.out.println(pn);
        System.out.println("-".repeat(20));
        System.out.println(pb);

        System.out.println("-".repeat(50));

        Pregunta<String> c = new Pregunta<>("¿Como estas?", "bien");
        Pregunta<Integer> n = new Pregunta<>("¿10+5?", 15);
        Pregunta<Boolean> b = new Pregunta<>("¿Es sabado?", false);

        System.out.println("PREGUNTAS GENERICAS: ");
        System.out.println("-".repeat(50));
        System.out.println(c);
        System.out.println("-".repeat(20));
        System.out.println(n);
        System.out.println("-".repeat(20));
        System.out.println(b);

    }
}