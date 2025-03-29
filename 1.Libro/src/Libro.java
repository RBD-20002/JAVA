public class Libro {

    private String titulo;
    private String autor;
    private int numPaginas;
    private int ISBN;

    public Libro(String titulo, String autor, int numPaginas, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String toString() {
        return "Libro:" +
                "\n   [Titulo: " + titulo +
                "\n   ,Autor: " + autor +
                "\n   ,Número pagina: " + numPaginas +
                "\n   ,ISBN: " + ISBN + "]";
    }
}
