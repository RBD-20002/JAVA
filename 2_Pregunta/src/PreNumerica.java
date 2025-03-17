public class PreNumerica {

    private String pregunta;
    private Integer respuesta;

    public PreNumerica(String pregunta, Integer respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }
    public void setRespuesta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Integer getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(Integer respuesta) {
        this.respuesta = respuesta;
    }
}
