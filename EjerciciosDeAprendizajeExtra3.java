
package introjavanotebook;

import java.util.Scanner;

public class EjerciciosDeAprendizajeExtra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra:");
        letra = leer.next();
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("la letra ingresada es una vocal.");
        } else{
            System.out.println("la letra ingresada no es vocal.");
        }
    }
}
