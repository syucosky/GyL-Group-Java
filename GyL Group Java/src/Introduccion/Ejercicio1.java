
package Introduccion;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        int num, num1, resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Primer numero a operar");
        num = leer.nextInt();
        System.out.println("Segundo numero a operar");
        num1 = leer.nextInt();
        resultado = num + num1;
        System.out.println("La suma de: "+ num +" + "+ num1 + " es: " + resultado);
    }
    
}
