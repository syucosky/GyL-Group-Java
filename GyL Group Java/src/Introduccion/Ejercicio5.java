/*Escribir un programa que lea un número entero por teclado y 
muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().*/

package Introduccion;
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,doble,triple;
        double rCuadrada;
        System.out.println("Numero a utilizar");
        num = leer.nextInt();
        doble = num * 2;
        System.out.println("Doble de: "+ num + " es: "+doble);
        triple = num * 3;
        System.out.println("Triple de: "+ num + " es: "+ triple);
        rCuadrada = Math.sqrt(num);
        System.out.println("Raiz cuadrada de: "+ num + " es: "+rCuadrada);
    }
    
}
