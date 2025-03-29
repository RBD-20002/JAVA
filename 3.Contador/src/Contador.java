public class Contador {

    private int contador;

    public Contador() {
    }

    public Contador(int contador) {
        if (contador < 1) this.contador = 0;
        else this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void incrementar() {
        contador++;
    }

    public void decrementar() {
        contador--;
        if (contador < 0) contador = 0;
    }
}
