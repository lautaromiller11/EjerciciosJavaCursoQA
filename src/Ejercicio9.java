
import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int contador = 0;
    int suma = 0;
    int numero;
    while (contador == 0){
        System.out.println("ingrese un numero: ");
        numero =  leer.nextInt();
        if (numero == 0){
            System.out.println("Se capturo el numero cero");
            break;
        }
        if (numero > 0){
            suma += numero;
        }
        contador++;
    }
    System.out.println("La suma de los numeros leidos es " + suma );
    }
}






