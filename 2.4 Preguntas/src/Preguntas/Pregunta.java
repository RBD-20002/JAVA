package Preguntas;

public class Pregunta<T> {

    private String pregunta;
    private T respuesta;

    public Pregunta(String pregunta, T respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public T getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(T respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Pregunta: " + pregunta +
                "\nRespuesta: " + respuesta;
    }
}
