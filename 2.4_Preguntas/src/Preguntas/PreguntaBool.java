package Preguntas;

public class PreguntaBool {

    private String pregunta;
    private boolean respuesta;

    public PreguntaBool(String pregunta, boolean respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Pregunta: " + pregunta +
                "\nRespuesta: " + respuesta;
    }
}
