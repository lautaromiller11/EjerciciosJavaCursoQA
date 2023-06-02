
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosDeAprendizaje16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vector = generarVectorAleatorio(N);
        System.out.println("Vector generado: " + Arrays.toString(vector));
        System.out.println("Ingrese el numero a buscar: ");
        int numeroBuscar = leer.nextInt();
        int indice = buscarNumero(vector, numeroBuscar);
        if (indice != -1) {
            System.out.println("El número " + numeroBuscar + " se encuentra en el índice " + indice + " del vector.");
            if (contarRepeticiones(vector, numeroBuscar) > 1) {
                System.out.println("El número " + numeroBuscar + " también se encuentra repetido en el vector.");
            }
        } else {
            System.out.println("El numero " + numeroBuscar + " no se encuentra en el vector");
        }
    }

    private static int[] generarVectorAleatorio(int N) {
        Random numRandom = new Random();
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = numRandom.nextInt(100);
        }
        return vector;
    }

    private static int buscarNumero(int[] vector, int numeroBuscar) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numeroBuscar) {
                return i;
            }
        }
        return -1;
    }

    private static int contarRepeticiones(int[] vector, int numeroBuscar) {
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numeroBuscar) {
                contador++;
            }
        }
        return contador;
    }
}