
public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private int numPaginas;
    private String genero;

    public Libro(String titulo, String autor, String isbn, int numPaginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.genero = genero;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "\nTitulo: " + titulo + "\nAutor: " + autor + "\nIsbn: " + isbn + "\nNumPaginas: " + numPaginas
                + "Genero: " + genero;
    }    

    

}