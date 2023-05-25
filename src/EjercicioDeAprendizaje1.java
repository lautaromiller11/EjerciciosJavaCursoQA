
import java.util.Scanner;


public class EjercicioDeAprendizaje1 {

    public static void main(String[] args) {
        int num1;
        int num2;
        int suma;
        System.out.println("Ingrese el primer numero");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("La suma de los dos numeros es: " + suma );
    }
    
}
