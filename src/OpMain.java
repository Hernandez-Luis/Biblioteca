import java.util.ArrayList;
import java.util.Scanner;

public class OpMain {
    public void op(){
        Scanner scanner = new Scanner(System.in);
        Registro registro = new Registro();
        Menu menu = new Menu();
        Calcular calcular = new Calcular();
        Mostrar mostrar = new Mostrar();
        ArrayList<Usuario> usuario = null;
        ArrayList<Alumno> alumno = null;
        ArrayList<Profesor> profesor = null;
        ArrayList<Libros> libros = null;
        ArrayList<Prestamo> prestamos = null;

        int x = 0;
        int contUsuario = 0;
        int pagar = 0;

        while (x != 11){
            x = menu.opMenu(scanner);
            switch (x){
                case 1:
                    usuario = registro.usuario(scanner);
                    break;
                case 2:
                    alumno = registro.alumno(scanner);
                    break;
                case 3:
                    profesor = registro.profesor(scanner);
                    break;
                case 4, 7:
                    mostrar.libros(libros);
                    registro.prestamo(scanner,libros,profesor,alumno,prestamos);
                    break;
                case 5:
                    registro.devolver(libros,alumno,profesor,scanner);
                    break;
                case 6:
                    System.out.println("La libreria te cobrara " + calcular.precio(scanner) + " pesos");
                    break;
                case 8:
                    System.out.println("Debes pagar " + calcular.precio(scanner) + " pesos");
                    break;
                case 9:
                     libros = registro.libros(scanner);
                    break;
                case 10:
                    mostrar.libros(libros);
                    break;
            }
        }
    }
}
