
import java.util.Scanner;


public class Ejercicio8 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        nota = 0;
        do {
            System.out.print("Ingrese la nota entre 0 y 10: ");
            nota = leer.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("La nota ingresada no es valida.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("La nota ingresada es: " + nota);
    }
}
