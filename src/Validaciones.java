import java.util.ArrayList;
import java.util.Scanner;

public class Validaciones {
    Mostrar mostrar = new Mostrar();
    public void entero(Scanner scanner){
        while (!scanner.hasNextInt()){
            System.out.println("Ingresa un valor numerico");
            scanner.next();
        }
    }

    public int buscarLibro(ArrayList<Libros> libros,String buscar){
        int cantLibros = 0;

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getNombre().equals(buscar)) {
                cantLibros = libros.get(i).getNumEjemplares();
                System.out.println("Encontrado");
                return i;
            }
        }
        System.out.println("Libro no encontrado");
        return -1;
    }

    public int buscarProfe(String nombre, ArrayList<Profesor> profesor){

        for (int i = 0; i < profesor.size(); i++) {
            if (profesor.get(i).getNombreProfesor().equals(nombre)){
                return i;
            }
        }
        System.out.println("Profesor no encontrado!");
        return -1;
    }

    public int buscarAlumnos(String nombre, ArrayList<Alumno> alumnos){
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombreAlumno().equals(nombre)){
                return i;
            }
        }
        System.out.println("Profesor no encontrado!");
        return -1;
    }
}
