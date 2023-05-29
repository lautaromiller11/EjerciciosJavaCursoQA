
import java.util.Scanner;


public class EjercicioDeAprendizaje7 {

    public static void main(String[] args) {
        String frase;
        String fraseCorrecta  = "eureka";
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in); 
        frase = leer.nextLine();
        if (frase.equals(fraseCorrecta) ){
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
    }
    
}
