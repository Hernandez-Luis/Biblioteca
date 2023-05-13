import java.util.Scanner;

public class Calcular {
    public int precio(Scanner scanner){
        System.out.println("Ingresa el numero de libros que pediste: ");
        int numPedi = scanner.nextInt();
        System.out.println("Ingresa el numero de dias sin pagar: ");
        int sinPaga = scanner.nextInt();

        if (sinPaga>3){
            return sinPaga * 10;
        }
        return 0;
    }
}
