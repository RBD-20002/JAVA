package Preguntas;

public class PreguntaNumerica {

    private String pregunta;
    private int respuesta;

    public PreguntaNumerica(String pregunta, int respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Pregunta: " + pregunta +
                "\nRespuesta: " + respuesta;
    }
}
