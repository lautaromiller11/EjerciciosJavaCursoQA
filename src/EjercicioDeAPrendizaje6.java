
import java.util.Scanner;


public class EjercicioDeAprendizaje6 {

    public static void main(String[] args) {
        int num;
        System.out.println("Ingrese un numero entero:");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        if (num % 2  == 0){
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }
    
    }    
}
