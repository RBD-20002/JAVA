package Vehiculos;

public class Bicicleta extends Vehiculo {

    private Tipo tipo;

    public Bicicleta(String marca, String modelo, Tipo tipo) {
        super(marca, modelo);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bicicleta: " +
                "\n -Tipo: " + tipo;
    }

    public enum Tipo {MONTANA, CARRETERA, CIUDAD}
}
