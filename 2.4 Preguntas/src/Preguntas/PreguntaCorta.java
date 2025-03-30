package Preguntas;

public class PreguntaCorta {
    private String pregunta;
    private String respuesta;

    public PreguntaCorta(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Pregunta: " + pregunta +
                "\nRespuesta: " + respuesta;
    }
}
