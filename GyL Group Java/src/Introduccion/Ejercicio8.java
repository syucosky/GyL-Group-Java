package Introduccion;
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Frase de longitud 8");
        frase = leer.next();
        if (frase.length() == 8){
            System.out.println("frase correcta");
        }else{
            System.out.println("frase incorrecta");
        }
    }
    
}
