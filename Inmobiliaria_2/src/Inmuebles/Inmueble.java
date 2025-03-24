package Inmuebles;

public class Inmueble {

    private String nombre;
    private double mCuadrados;
    private int numHabit;
    private boolean garaje;
    private String direccion;

    public Inmueble(String nombre, double mCuadrados, int numHabit, boolean garaje, String direccion) {
        this.nombre = nombre;
        this.mCuadrados = mCuadrados;
        this.numHabit = numHabit;
        this.garaje = garaje;
        this.direccion = direccion;
    }

    public Inmueble(double mCuadrados, int numHabit, boolean garaje, String direccion) {
        this.mCuadrados = mCuadrados;
        this.numHabit = numHabit;
        this.garaje = garaje;
        this.direccion = direccion;
    }

    public double getmCuadrados() {
        return mCuadrados;
    }

    public void setmCuadrados(double mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    public int getNumHabit() {
        return numHabit;
    }

    public void setNumHabit(int numHabit) {
        this.numHabit = numHabit;
    }

    public boolean isGaraje() {
        return garaje;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "mCuadrados=" + mCuadrados +
                ", numHabit=" + numHabit +
                ", garaje=" + garaje +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
