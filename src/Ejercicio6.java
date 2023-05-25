
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        if (num1 > 25 && num2 > 25){
            System.out.println("ambos numeros son mayores a 25");
        } else if (num1 > 25){
            System.out.println("el primer numero es mayor a 25");
        }  
    }
}
