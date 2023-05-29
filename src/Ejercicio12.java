
import java.util.Scanner;


public class Ejercicio12 {


    public static void main(String[] args) {
        int num1;
        int num2;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el primer numero:");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = leer.nextInt();
        EsMultiplo (num1, num2);
        
    }
    
    
    public static void EsMultiplo (int nume1, int nume2){
        int resultado;
        resultado = nume1 % nume2;
        if (resultado == 0){
            System.out.println("Es multiplo");
        } else{
            System.out.println("No es multiplo");
        }
    }
    
}
