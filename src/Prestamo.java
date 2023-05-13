public class Prestamo {
    private String nombreQuien;
    private int cantLibros;
    private String nombreLibro;

    public Prestamo(String nombreQuien, int cantLibros,String nombreLibro) {
        this.nombreQuien = nombreQuien;
        this.cantLibros = cantLibros;
        this.nombreLibro = nombreLibro;
    }

    public String getNombreQuien() {
        return nombreQuien;
    }

    public int getCantLibros() {
        return cantLibros;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    @Override
    public String toString(){
        return  nombreQuien + " lleva " + cantLibros + " libros prestados";
    }
}
