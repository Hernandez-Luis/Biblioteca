import java.util.Scanner;

public class Menu {
    public int opMenu(Scanner scanner){
        System.out.println("\t- Registrar -\n1. Registrar usuario\n2. Registrar Alumno\n3. Registrar Profesor\n\t- Solo usuarios -\n" +
                "4. Solicitar prestamo\n5. Devolver libro\n6. Pagar multa\n\t- Operaciones Biblioteca -\n7. Prestar libro\n8. Cobrar multa\n9.Registrar libro" +
                "\n10. Consultar\n11. Salir");
        return scanner.nextInt();
    }
}
