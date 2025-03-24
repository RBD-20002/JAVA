package Inmuebles;

public class Piso extends Inmueble{

    private double altura;
    private String puerta;

    public Piso(double mCuadrados, int numHabit, boolean garaje, String direccion, double altura, String puerta) {
        super(mCuadrados, numHabit, garaje, direccion);
        this.altura = altura;
        this.puerta = puerta;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    @Override
    public String toString() {
        return "Piso{" +
                "altura=" + altura +
                ", puerta='" + puerta + '\'' +
                '}';
    }
}
