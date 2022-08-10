
package Introduccion;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio11 {

    public static void main(String[] args) {
        int num1,num2,opcion,resultado;
        String fin;
        Scanner leer = new Scanner(System.in);
        fin = "N";
        do{
            System.out.println("");
            System.out.println("Eliga operador");
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            if (opcion == 5){
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                fin = toUpperCase(leer.next());
            }else{
                System.out.println("Elegir primer numero");
                num1 = leer.nextInt();
                System.out.println("Elegir segundo numero");
                num2 = leer.nextInt();
                switch(opcion){
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("La suma de: " + num1 + " + " + num2+ " es: " +resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("La resta de: " + num1 + " + " + num2+ " es: " +resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("La multiplicacion de: " + num1 + " + " + num2+ " es: " +resultado);
                        break;
                    case 4:
                        resultado = num1 / num2;
                        System.out.println("La division de: " + num1 + " + " + num2+ " es: " +resultado);
                        break;
                }}
        }while ("N".equals(fin));
    }
    
}
