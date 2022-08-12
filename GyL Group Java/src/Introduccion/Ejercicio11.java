package Introduccion;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,num1,opcion,resultado;
        String fin;
        fin = "N";
        do{
            System.out.println("Menu");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            if (opcion == 5){
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                fin = toUpperCase(leer.next());
            }else{
                System.out.println("Elijar primer numero");
                num = leer.nextInt();
                System.out.println("Elijar segundo numero");
                num1 = leer.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("La suma de "+num+" con "+ num1);
                        resultado = num + num1;
                        System.out.println(resultado);
                        break;
                    case 2:
                        System.out.println("La resta de "+num+" con "+ num1);
                        resultado = num - num1;
                        System.out.println(resultado);
                        break;
                    case 3:
                        System.out.println("La multiplicacion de "+num+" con "+ num1);
                        resultado = num * num1;
                        System.out.println(resultado);
                        break;
                    case 4:
                        System.out.println("La division de "+num+" con "+ num1);
                        resultado = num / num1;
                        System.out.println(resultado);
                        break;          
               }
            }   
        }while ("N".equals(fin));  
    }
}
