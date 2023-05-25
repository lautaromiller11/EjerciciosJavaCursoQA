import java.util.Scanner;

public class EjercicioDeAprendizaje9 {


    public static void main(String[] args) {
        String palabra;
        String letra = "a";
        System.out.println("Ingrese una palabra o frase:");
        Scanner leer = new Scanner(System.in);
        palabra = leer.nextLine();
        if (palabra.substring(0,1).equals("a")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
