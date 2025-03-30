package Vehiculos;

public class Motor {

    private int cilindrada;
    private double potencia;

    public Motor(int cilindrada, double potencia) {
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor: " +
                "\n -Cilindrada: " + cilindrada +
                "\n -Potencia: " + potencia;
    }
}
