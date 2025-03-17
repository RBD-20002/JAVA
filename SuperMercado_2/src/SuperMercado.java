import java.util.LinkedList;
import java.util.Queue;

public class SuperMercado {

    public Queue<Cliente> clientes;

    public SuperMercado() {
        clientes = new LinkedList<>(); // Inicializar la cola
    }

    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public Cliente atenderCliente() {
        return clientes.poll();
    }

    public Queue<Cliente> getClientes() {
        return clientes;
    }
}
