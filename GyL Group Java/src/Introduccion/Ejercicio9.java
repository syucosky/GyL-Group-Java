package Introduccion;
import java.util.Scanner;
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Frase a validar");
        frase = leer.next();
        if (frase.substring(0, 0).equals("A")){
            System.out.println("frase correcta");
        }else{
            System.out.println("frase incorrecta");
        }
    }
    
}