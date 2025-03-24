package Inmuebles;

public class Casa extends Inmueble{

    private int numPlanta;
    private boolean piscina;

    public Casa(double mCuadrados, int numHabit, boolean garaje, String direccion, int numPlanta, boolean piscina) {
        super(mCuadrados,numHabit,garaje,direccion);
        this.numPlanta = numPlanta;
        this.piscina = piscina;
    }

    public int getNumPlanta() {
        return numPlanta;
    }

    public void setNumPlanta(int numPlanta) {
        this.numPlanta = numPlanta;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "numPlanta=" + numPlanta +
                ", piscina=" + piscina +
                '}';
    }
}
