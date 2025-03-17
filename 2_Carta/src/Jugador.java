import java.util.Stack;

public class Jugador {

    private String nombre;
    private Stack<Carta> cartas;

    public Jugador(String nombre, Stack<Carta> cartas) {
        this.nombre = nombre;
        this.cartas = cartas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Stack getCartas() {
        return cartas;
    }
    public void setCarta(Stack<Carta> cartas) {
        this.cartas = cartas;
    }
}
