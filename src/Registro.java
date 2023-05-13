import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    Mostrar mostrar = new Mostrar();
    ArrayList<Prestamo> lista = new ArrayList<>();
    Validaciones validaciones = new Validaciones();
    private int contUsuarios = 0;
    public ArrayList<Usuario> usuario(Scanner scanner){
        ArrayList<Usuario> lista = new ArrayList<>();

        System.out.println("Ingres su nombre: ");
        String nombreUsuario = scanner.next();
        System.out.println("Ingresa su apellido: ");
        String apellidoUsuario = scanner.next();
        System.out.println("Ingresa su edad: ");
        validaciones.entero(scanner);
        int edadUsuario = scanner.nextInt();
        System.out.println("Ingresa su direccion: ");
        String direccion = scanner.next();
        System.out.println("Ingresa su telefono: ");
        validaciones.entero(scanner);
        int telefono = scanner.nextInt();
        System.out.println("Ingresa su correo: ");
        String correo = scanner.next();
        System.out.println("Ingresa el tipo de usuario (Pofesor o Alumno): ");
        String tipoUsuario = scanner.next();
        contUsuarios++;

        lista.add(new Usuario(contUsuarios,nombreUsuario,apellidoUsuario,edadUsuario,direccion,telefono,correo,tipoUsuario));
        return lista;
    }

    public ArrayList<Profesor> profesor(Scanner scanner){
        ArrayList<Profesor> profe = new ArrayList<>();

        System.out.println("Ingres su nombre: ");
        String nombre = scanner.next();
        System.out.println("Ingresa su apellido: ");
        String apellido = scanner.next();
        System.out.println("Ingresa su edad: ");
        validaciones.entero(scanner);
        int edad = scanner.nextInt();
        System.out.printf("Ingresa su Instituto: ");
        String instituto = scanner.next();
        System.out.println("Ingresa su area: ");
        String area = scanner.next();

        profe.add(new Profesor(nombre,apellido,edad,instituto,area,0,""));

        return profe;
    }

    public ArrayList<Alumno> alumno(Scanner scanner){
        ArrayList<Alumno> estudiante = new ArrayList<>();

        System.out.println("Ingres su nombre: ");
        String nombre = scanner.next();
        System.out.println("Ingresa su apellido: ");
        String apellido = scanner.next();
        System.out.println("Ingresa su edad: ");
        validaciones.entero(scanner);
        int edad = scanner.nextInt();
        System.out.println("Ingresa su semestre: ");
        String  semestre = scanner.next();
        System.out.println("Ingresa su matricula: ");
        String matricula = scanner.next();
        System.out.println("Ingresa su carrera: ");
        String carrera = scanner.next();

        estudiante.add(new Alumno(nombre,apellido,edad,semestre,matricula,carrera,0));

        return estudiante;
    }

    public ArrayList<Libros> libros(Scanner scanner){

        ArrayList<Libros> libros = new ArrayList<>();

        System.out.println("Ingresa su ISBN: ");
        String isbn = scanner.next();
        System.out.println("Ingresa el titulo: ");
        String titulo = scanner.next();
        System.out.println("Ingresa el autor: ");
        String autor = scanner.next();
        System.out.println("¿Esta disponible?: ");
        String disponibilidad = scanner.next();
        System.out.println("Ingresa el numero de ejemplares: ");
        validaciones.entero(scanner);
        int numEjemplares = scanner.nextInt();

        libros.add(new Libros(isbn,titulo,autor,disponibilidad,numEjemplares));

        return libros;
    }

    public void prestamo(Scanner scanner,ArrayList<Libros> libro,ArrayList<Profesor> profesor,ArrayList<Alumno> alumnos,ArrayList<Prestamo> prestamos){
        int x = 0,y = -1;
        int cantLibros = 0;
        int prestado = 0;

        System.out.println("\n\t- P R E S T A M O -");
        System.out.println("Ingresa el tipo de usuario (Profesor o Alumno)");
        String tipo = scanner.next();
        if (tipo.equals("Profesor")) {
            if (!profesor.isEmpty()){
                while (y == -1){
                    System.out.println("Ingresa su nombre: ");
                    String nombre = scanner.next();
                    y = validaciones.buscarProfe(nombre,profesor);
                    if(nombre.equals("Salir")) y = -1;
                }

                mostrar.libros(libro);
                System.out.println("Ingresa el nombre del libro que se desea agregar: ");
                String nombreLibro = scanner.next();

                x = validaciones.buscarLibro(libro,nombreLibro);
                if (x != -1){
                    prestado = 0;
                    cantLibros = 0;

                    cantLibros = profesor.get(y).getCantLibro();
                    prestado = libro.get(x).getNumEjemplares();

                    profesor.get(y).setCantLibro(cantLibros+1);
                    libro.get(x).setNumEjemplares(prestado-1);
                    System.out.println("Agregado");
                }
            }
            else System.out.println("No hay profesores registrados");
        }
        else if(tipo.equals("Alumno")) {
            if (!alumnos.isEmpty()){
                while (y == -1){
                    System.out.println("Ingresa su nombre: ");
                    String nombre = scanner.next();
                    y = validaciones.buscarAlumnos(nombre,alumnos);
                    if(nombre.equals("Salir")) y = -1;
                }

                mostrar.libros(libro);
                System.out.println("Ingresa el nombre del libro que se desea agregar: ");
                String nombreLibro = scanner.next();

                x = validaciones.buscarLibro(libro,nombreLibro);
                if (x != -1){
                    prestado = 0;
                    cantLibros = 0;

                    prestado = libro.get(x).getNumEjemplares();
                    cantLibros = alumnos.get(y).getCantLibro();

                    alumnos.get(y).setCantLibro(cantLibros+1);
                    libro.get(x).setNumEjemplares(prestado-1);
                    System.out.println("Agregado");
                }
            }
            else System.out.println("No hay alumnos registrados");
        }
    }

    public void devolver(ArrayList<Libros> libros,ArrayList<Alumno> Alumnos,ArrayList<Profesor> profesor,Scanner scanner){
        int x = 0;
        int alm = -1;
        int cantLib = 0;
        int prestados = 0;

        System.out.println("Ingresa el tipo de usuario: ");
        String usuario = scanner.next();
        if (usuario.equals("Alumno")){
            while (alm == -1){
                System.out.println("Ingresa su nombre: ");
                String nombre = scanner.next();
                alm = validaciones.buscarAlumnos(nombre,Alumnos);
                if(nombre.equals("Salir")) alm = -1;
            }
            mostrar.libros(libros);
            System.out.println("Ingresa el nombre del libro que se desea devolver: ");
            String nombreLibro = scanner.next();

            x = validaciones.buscarLibro(libros,nombreLibro);
            if (x!=-1){
                prestados = libros.get(x).getNumEjemplares();
                cantLib = Alumnos.get(x).getCantLibro();
                Alumnos.get(alm).setCantLibro(cantLib-1);
                libros.get(x).setNumEjemplares(prestados+1);
            }
        }
        else {
            while (alm == -1){
                System.out.println("Ingresa su nombre: ");
                String nombre = scanner.next();
                alm = validaciones.buscarProfe(nombre,profesor);
                if(nombre.equals("Salir")) alm = -1;
            }
            mostrar.libros(libros);
            System.out.println("Ingresa el nombre del libro que se desea devolver: ");
            String nombreLibro = scanner.next();

            x = validaciones.buscarLibro(libros,nombreLibro);
            if (x!=-1){
                prestados = libros.get(x).getNumEjemplares();
                cantLib = Alumnos.get(x).getCantLibro();
                Alumnos.get(alm).setCantLibro(cantLib-1);
                libros.get(x).setNumEjemplares(prestados+1);
            }
        }
    }
}
