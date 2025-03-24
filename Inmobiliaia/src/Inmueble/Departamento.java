package Inmueble;

public class Departamento extends Inmueble {

    private int piso;
    private boolean expensas;

    public Departamento(String ubicacion, double precio, Estado estado, int piso, boolean expensas) {
        super(ubicacion, precio, estado);
        this.piso = piso;
        this.expensas = expensas;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public boolean isExpensas() {
        return expensas;
    }

    public void setExpensas(boolean expensas) {
        this.expensas = expensas;
    }

    @Override
    public String toString() {
        return "Inmueble.Inmueble.Departamento{" +
                "piso='" + piso + '\'' +
                ", expensas=" + expensas +
                '}';
    }
}
