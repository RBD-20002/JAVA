public class Main {
    public static void main(String[] args) {

        SuperMercado colaClientes = new SuperMercado();

        Cliente c1 = new Cliente("Roberto");
        Cliente c2 = new Cliente("Ded");
        Cliente c3 = new Cliente("Juan");
        Cliente c4 = new Cliente("Barca");
        Cliente c5 = new Cliente("Ricardo");
        Cliente c6 = new Cliente("Jacqueline");

        colaClientes.addCliente(c1);
        colaClientes.addCliente(c2);
        colaClientes.addCliente(c3);
        colaClientes.addCliente(c4);
        colaClientes.addCliente(c5);
        colaClientes.addCliente(c6);

        while(!colaClientes.getClientes().isEmpty()) {
            Cliente clienteActual = colaClientes.atenderCliente();
            System.out.println("Atendiendo: "+clienteActual.getNombre());
            System.out.println("Atencion completada, vuelva pronto");
            System.out.println("-".repeat(50));
        }
    }
}