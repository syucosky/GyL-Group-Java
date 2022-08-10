package Introduccion;
import java.util.Scanner;
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,num1,total;
        total = 0;
        System.out.println("Limite");
        num = leer.nextInt();
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        while(total < num){
            total += num1;
            System.out.println("Ingrese un numero");
            num1 = leer.nextInt();
        }
    }
    
}
