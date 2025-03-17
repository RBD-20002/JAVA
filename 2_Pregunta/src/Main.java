public class Main {
    public static void main(String[] args) {

        Pregunta<String> PreCorta = new Pregunta<>("¿Capital de Portugal?", "Lisboa");
        Pregunta<Integer> PreNumerica = new Pregunta<>("¿6+8?", 14);
        Pregunta<Boolean> PreBoolean = new Pregunta<>("¿ES VIERNES?", false);

        System.out.println("Preguntas genéricas: ");
        System.out.println("-".repeat(30));
        System.out.println("Pregunta: " + PreCorta.getPregunta() + "\nRespuesta: " + PreCorta.getRespuesta());
        System.out.println("-".repeat(30));
        System.out.println("Pregunta: " + PreNumerica.getPregunta() + "\nRespuesta: " + PreNumerica.getRespuesta());
        System.out.println("-".repeat(30));
        System.out.println("Pregunta: " + PreBoolean.getPregunta() + "\nRespuesta: " + PreBoolean.getRespuesta());
    }
}