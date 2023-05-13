public class Libros {
    private String isbn;
    private String nombre;
    private String autor;
    private String disponible;
    private int numEjemplares;

    public Libros(String isbn, String nombre, String autor, String disponible, int numEjemplares) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.disponible = disponible;
        this.numEjemplares = numEjemplares;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getDisponible() {
        return disponible;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    @Override
    public String toString(){
        return "ISBN: " + isbn + " Nombre: " + nombre + " Autor: " + autor + " Disponibilidad: "
                + disponible + " Numero de ejemplares: " + numEjemplares;
    }
}
