/*
 Realizar un algoritmo que rellene un vector con los 
100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package Introduccion;

public class Ejercici15 {

    public static void main(String[] args) {
        int[] vec = new int[100];
        for(int i=0; i < 100; i++){
            vec[i] = (int) (Math.random()*10);
        }
        for(int i=0; i < 100; i++){
            System.out.print(vec[i]+" ~ ");
            if (i % 10 == 0){
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }
    
}
