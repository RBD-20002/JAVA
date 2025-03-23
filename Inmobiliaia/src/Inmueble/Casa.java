package Inmueble;

public class Casa extends Inmueble {

    private int numCuartos;
    private double metraje;

    public Casa(String ubicacion, double precio, Inmueble.Estado estado, int numCuartos, double metraje) {
        super(ubicacion, precio, estado);
        this.numCuartos = numCuartos;
        this.metraje = metraje;
    }

    public int getNumCuartos() {
        return numCuartos;
    }

    public void setNumCuartos(int numCuartos) {
        this.numCuartos = numCuartos;
    }

    public double getMetraje() {
        return metraje;
    }

    public void setMetraje(double metraje) {
        this.metraje = metraje;
    }

    @Override
    public String toString() {
        return "Inmueble.Inmueble.Casa{" +
                "numCuartos=" + numCuartos +
                ", metraje=" + metraje +
                '}';
    }
}
