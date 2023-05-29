
import java.util.Scanner;


public class EjercicioDeAprendizaje10 {

    public static void main(String[] args) {
        int valorLimite;
        int suma= 0;
        int contador = 0;
        int num;
        System.out.println("Ingrese un valor limite positivo:");
        Scanner leer = new Scanner(System.in);
        valorLimite = leer.nextInt();
        while ( suma <= valorLimite){
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            suma += num;
            contador++;
        }
        System.out.println("La suma de los numeros introducidos supero el limite inicial");
        System.out.println("Se ingresaron un total de " + contador + " numeros.");
        System.out.println("La suma total es: " + suma);
    }
    
}
