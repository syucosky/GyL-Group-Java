package Introduccion;
import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,veces;
        boolean ok;
        ok = false;
        veces = 0;
        int[] vec = new int[10];
        for(int i=0; i < 10; i++){
            vec[i] = (int) (Math.random()*10);
        }
        for(int i=0; i < 10; i++){
            System.out.println(vec[i]);
        }
        System.out.println("ingrese numero a buscar");
        n = leer.nextInt();
        for(int i=0; i < 10; i++){
            if (vec[i] == n){
                ok = true;  
                veces++;
            }
        }
        if (ok){
            System.out.println("El numero fue encontrado: "+ veces+ " veces");
        }else{
            System.out.println("El numero no fue encontrado");
        }
    }
    
}

