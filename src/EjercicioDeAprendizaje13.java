
import java.util.Scanner;


public class EjercicioDeAprendizaje13 {

    public static void main(String[] args) {
        int tamanioCuadrado; 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
        tamanioCuadrado = leer.nextInt();
        dibujarCuadrado(tamanioCuadrado);
    }
    public static void dibujarCuadrado(int tamanioCuadrado){
        for (int i = 0; i  < tamanioCuadrado; i++){
        for (int j = 0; j < tamanioCuadrado; j++){
            if (i == 0 || i == tamanioCuadrado - 1 || j == 0 || j == tamanioCuadrado -1){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
            System.out.println();
        }
    }
}
