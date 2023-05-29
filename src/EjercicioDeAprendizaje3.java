
import java.util.Scanner;


public class EjercicioDeAprendizaje3 {

    public static void main(String[] args) {
        String frase;
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in); 
        frase = leer.nextLine();
        System.out.println("La frase en mayusculas es:");
        System.out.println(" " + frase.toUpperCase() );
        System.out.println("La frase en minusculas es:");
        System.out.println(" " + frase.toLowerCase() );
    }
    
}
