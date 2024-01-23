/*
 Biblioteca: Guarda los libros en 4 arrays.
 Como maximo tendrá 100 libros.
 Cada posición de los arrays corresponde a los datos de un libro.
 Por ejemplo:
 la posición 0 del array de títulos contiene: "El Quijote"
 la posición 0 del array de autores contiene: "Cervantes"
 la posición 0 del array de isbns contiene: "978-84-15474-01-1"
 la posición 0 del array de numPaginas contiene: 863
 la posición 0 del array de generosLiterarios contiene: "Novela"

 
    Encapsula los arrays de la clase Biblioteca en una clase y 
    refactoriza los metodos de la clase Biblioteca.

*/
public class Biblioteca {

    private Libro[] listaLibros;

    public Biblioteca() {
        listaLibros = new Libro[100];
    }

    // Devuelve true si añade el libro en la biblioteca o false en caso contrario
    public boolean añadirLibro(Libro libro) {

        for (int i = 0; i < listaLibros.length; i++) {
            if (listaLibros[i] == null) {
                listaLibros[i] = libro;
                return true;
            }
        }
        return false;

    }

    // Elimina el libro con el isbn indicado
    public void eliminarLibro(String isbn) {
        boolean eliminada = false;
        for (int i = 0; i < listaLibros.length; i++) {
            if (listaLibros[i]!=null){
            if (listaLibros[i].getIsbn().equals(isbn)) {
                eliminada = true;
                break;
            }
            }
        }
        if (!eliminada) {
            System.out.println("Libro no eliminado, no existe");
        } else {
            System.out.println("Libro eliminada");
        }
    }

    // Muestra todos los libros de la biblioteca
    public void mostrarLibros() {
        System.out.println("Los libros de la biblioteca son:");

        for (int i = 0; i < listaLibros.length; i++) {
           
            if (listaLibros[i] != null) {
                System.out.println("Titulo: " + listaLibros[i].getTitulo());
                System.out.println("Autor: " + listaLibros[i].getAutor());
                System.out.println("Isbn: " + listaLibros[i].getIsbn());
                System.out.println("Número páginas: " + listaLibros[i].getNumPaginas());
                System.out.println("Género: " + listaLibros[i].getGenero());
            }
        }

    }

    // Muestra los libros con el genero literario Novela
    public void getNovelas() {
        System.out.println("Los libros de novela de la biblioteca son:");

        for (int i = 0; i < listaLibros.length; i++) {

            if (listaLibros[i].getGenero() != null && listaLibros[i].getGenero().equals("Novela")) {

                System.out.println("Titulo: " + listaLibros[i].getTitulo());
                System.out.println("Autor: " + listaLibros[i].getAutor());
                System.out.println("Isbn: " + listaLibros[i].getIsbn());
                System.out.println("Número páginas: " + listaLibros[i].getNumPaginas());
                System.out.println("Género: " + listaLibros[i].getGenero());
            }
        }    

    }

    // Muestra los libros con el genero literario Poesia
    public void getPoesia() {
        System.out.println("Los libros de poesia de la biblioteca son:");
        for (int i = 0; i < listaLibros.length; i++) {

            if (listaLibros[i].getGenero() != null && listaLibros[i].getGenero().equals("Novela")) {
                System.out.println("Titulo: " + listaLibros[i].getTitulo());
                System.out.println("Autor: " + listaLibros[i].getAutor());
                System.out.println("Isbn: " + listaLibros[i].getIsbn());
                System.out.println("Número páginas: " + listaLibros[i].getNumPaginas());
                System.out.println("Género: " + listaLibros[i].getGenero());
            }
        }       

    }

    // Nos devuelve un array con los titulos de los libros de un autor

    public String[] librosDeAutor(String autor) {
        System.out.println("Los libros del autor:" + autor + " son:");
        String[] librosAutor = new String[100];
        int contador = 0;
        for (int i = 0; i < listaLibros.length; i++) {

            if (listaLibros[i].getAutor() != null && listaLibros[i].getAutor().equals(autor)) {
                librosAutor[contador] = listaLibros[i].getTitulo();
                contador++;
            }
        }
        return librosAutor;
    }

    // Nos devuelve el titulo del libro con mas paginas
    public void mostrarLibroMasLargo() {
        int max = 0;
        String titulo = "";
        for (int i = 0; i < listaLibros.length; i++) {
            if (listaLibros[i] != null) {
                if (listaLibros[i].getNumPaginas() > max) {
                    max = listaLibros[i].getNumPaginas();
                    titulo = listaLibros[i].getTitulo();
                }
            }
        }
        System.out.println("El libro mas largo es: " + titulo);
    }

}
