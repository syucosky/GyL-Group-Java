
package Introduccion;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double grados;
        System.out.println("Grados en centigrados");
        grados = leer.nextDouble();
        grados = 32 + (9 * grados / 5);
        System.out.println("Grados en Fahrenheit");
        System.out.println(grados);
    }
    
}
