
package Introduccion;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Escriba una frase a convertir en mayusculas y luego en minusculas");
        frase = leer.next();
        System.out.println("Todo en MAY: " + toUpperCase(frase));
        System.out.println("Todo en min: " + toLowerCase(frase));
    }
    
}
