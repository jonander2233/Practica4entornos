package figuras;
import java.util.Scanner;

public class Trapecio {
    public static void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base 1 del Trapecio: ");
        double side1 = scanner.nextDouble();
        System.out.print("Ingrese la base 2 del Trapecio: ");
        double side2 = scanner.nextDouble();
        System.out.print("Ingrese la altura del Trapecio: ");
        double height = scanner.nextDouble();

        double area = ((side1 + side2)*height)/2;
        System.out.println("El área del trapecio es: " + area);
        scanner.close();

    }
    
}
