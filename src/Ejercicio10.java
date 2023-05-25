
import java.util.Scanner;


public class Ejercicio10 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[4];
        
        for (int i = 0; i < 4; i++ ){
            System.out.println("Ingrese un numero entre 1 y 20: ");
            numeros [i] = leer.nextInt();
        }
        for (int numero : numeros){
            StringBuilder asteriscos = new StringBuilder();
            for (int j = 0 ; j < numero; j++){
                asteriscos.append("*");
            }
            System.out.println(numero + " " + asteriscos.toString());
        }
    }
    
}
