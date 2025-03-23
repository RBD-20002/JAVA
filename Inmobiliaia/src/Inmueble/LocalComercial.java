package Inmueble;

public class LocalComercial extends Inmueble {

    private String zona;
    private double metraje;

    public LocalComercial(String ubicacion, double precio, Estado estado, String zona, double metraje) {
        super(ubicacion, precio, estado);
        this.zona = zona;
        this.metraje = metraje;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getMetraje() {
        return metraje;
    }

    public void setMetraje(double metraje) {
        this.metraje = metraje;
    }

    @Override
    public String toString() {
        return "Inmueble.LocalComercial{" +
                "zona='" + zona + '\'' +
                ", metraje=" + metraje +
                '}';
    }
}
