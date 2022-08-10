/*
 Crear un programa que dado un numero
determine si es par o impar.
 */
package Introduccion;
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Numero a utilizar");
        num = leer.nextInt();
        if(num % 2 == 0){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero impar");
        }
    }
    
}
