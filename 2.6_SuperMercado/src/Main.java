
public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();
        supermercado.addCliente(new Cliente("Juan"));
        supermercado.addCliente(new Cliente("María"));
        supermercado.addCliente(new Cliente("Pedro"));
        supermercado.atenderClientes();
    }
}