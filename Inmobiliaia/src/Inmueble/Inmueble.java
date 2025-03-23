package Inmueble;

public class Inmueble {

    private String ubicacion;
    private double precio;
    private Estado estado;
    public Inmueble(String ubicacion, double precio, Estado estado) {
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Inmueble.Inmueble{" +
                ", ubicacion=" + ubicacion + "$'" +
                ", precio=" + precio +
                ", estado=" + estado +
                '}';
    }

    public enum Estado {DISPONIBLE, VENDIDO, ALQUILADO}
}
