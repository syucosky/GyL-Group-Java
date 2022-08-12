package Introduccion;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        String fde = "&&&&&";
        int correctas,incorrectas;
        correctas = 0;
        incorrectas = 0;
        Scanner leer = new Scanner(System.in);
        String cadena;
        System.out.println("enviar cadena a RS232");
        cadena = leer.next();
        cadena = cadena.substring(0, 4);
        while (!fde.equals(cadena)){
                if (cadena.substring(0, 0) == "X" & cadena.substring(4, 4) == "O"){
                    correctas++;
                }else
                    incorrectas++;
        }
        System.out.println("Cadenas correctas: "+ correctas);
        System.out.println("Cadenas incorrectas: "+ incorrectas);
        
    }
    
}
