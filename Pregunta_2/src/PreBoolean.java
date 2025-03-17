public class PreBoolean {

    private String pregunta;
    private Boolean respuesta;

    public PreBoolean(String pregunta, Boolean respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }
    public void setRespuesta(String pregunta) {
        this.respuesta = respuesta;
    }

    public Boolean getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(Boolean respuesta) {
        this.respuesta = respuesta;
    }
}
