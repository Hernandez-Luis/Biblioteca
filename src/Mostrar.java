import java.util.ArrayList;

public class Mostrar {
    public void libros(ArrayList<Libros> libros){
        for (int i = 0; i < libros.size(); i++) {
            System.out.println("- D A T O S -");
            System.out.printf(libros.toString());
            System.out.println("\n-------------------------------------------------");
        }
    }

    public void prestamos(ArrayList<Prestamo> prestamos){
        for (int i = 0; i < prestamos.size(); i++) {
            System.out.println("- P R E S T A M O S -");
            System.out.println(prestamos.toString());
        }
    }
}
