public class Cuenta {

    private String nombre;
    private String numCuenta;
    private double tipInteres;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String nombre, String numCuenta, double tipInteres, double saldo) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.tipInteres = tipInteres;
        this.saldo = saldo;
    }

    public Cuenta(final Cuenta c) {
        this.nombre = c.nombre;
        this.numCuenta = c.numCuenta;
        this.tipInteres = c.tipInteres;
        this.saldo = c.saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getTipInteres() {
        return tipInteres;
    }

    public void setTipInteres(double tipInteres) {
        this.tipInteres = tipInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Ingreso(double dinero) {
        if (dinero < 1) System.out.println("Ingreso invalido");
        else setSaldo(getSaldo() + dinero);
    }

    public void Retiro(double dinero) {
        if (getSaldo() < 0 || dinero > getSaldo()) System.out.println("Saldo insuficiente");
        else setSaldo(getSaldo() - dinero);
    }

    public void transferencia(Cuenta c, double dinero) {
        if (getSaldo() < 0 || getSaldo() < dinero) System.out.println("Saldo insuficiente para la transferencia");
        else if (getSaldo() > 1 && getSaldo() > dinero) {
            c.Ingreso(dinero);
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                ", tipInteres=" + tipInteres +
                ", saldo=" + saldo +
                '}';
    }
}
