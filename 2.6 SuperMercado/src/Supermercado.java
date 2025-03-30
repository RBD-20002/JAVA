import java.util.LinkedList;
import java.util.Queue;

public class Supermercado {
    private final Queue<Cliente> cola;

    public Supermercado() {
        cola = new LinkedList<>();
    }

    public void addCliente(Cliente c) {
        cola.add(c);
    }

    public void atenderClientes() {
        while (!cola.isEmpty()) {
            Cliente c = cola.poll();
            System.out.println("Atendiendo a " + c.getNombre());
        }
    }
}