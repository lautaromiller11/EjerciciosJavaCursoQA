
import java.util.Scanner;

public class EjerciciosDeAprendizaje5 {
    public static void main(String[] args) {
        int num;
        int numDoble;
        int numTriple;
        double  numRaiz = 0;
        System.out.println("ingrese un numero entero");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        numDoble = num * 2;
        System.out.println("-El doble del numero ingresado es: " + numDoble );
         numTriple = num * 3;
        System.out.println("-El triple del numero ingresado es: " + numTriple);
        numRaiz = Math.sqrt(num);
        System.out.println("-La raiz cuadrada del numero ingresado es: " + numRaiz);
    }
}
