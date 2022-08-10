package Introduccion;
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Escribir frase");
        frase = leer.next();
        System.out.println("Frase a comparar");
        if ("eureka".equals(frase)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
