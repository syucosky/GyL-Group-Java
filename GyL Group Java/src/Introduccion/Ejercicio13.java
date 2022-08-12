
package Introduccion;
import java.util.Scanner;
public class Ejercicio13 {

    public static void main(String[] args) {
       String[][] matriz;
       Scanner leer = new Scanner(System.in);
       int n = leer.nextInt();
       matriz = new String[n][n];
       for(int i = 0; i < n; i++){
           for(int j = 0; j < n; j++){
               if (i == 0 || j == 0 || i == n-1 || j== n-1){
                    System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }
           System.out.println(" ");
       }
       
    }
    
}
