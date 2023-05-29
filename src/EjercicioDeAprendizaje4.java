
import java.util.Scanner;


public class EjercicioDeAprendizaje4 {

    public static void main(String[] args) {
        int gradosC;
        int gradosF;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados");
        gradosC = leer.nextInt();
        gradosF = 32 + (9 * gradosC / 5);
        System.out.println("La equivalente a grados Fahrenheit es :" + gradosF );

    }
    
}
