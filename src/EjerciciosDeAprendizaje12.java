
import java.util.Scanner;


public class EjerciciosDeAprendizaje12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese una cadena: ");
            String input = leer.nextLine();
            if (input.equals("&&&&&")){
                System.out.println("Fin de envios.");
                break;
            }
            if (secuenciaEsValida(input)){
                System.out.println("Secuencia valida");
            } else {
                System.out.println("secuencia invalida");
            }
        }
    }
    public static boolean secuenciaEsValida(String secuencia){
        if (secuencia.length() != 5){
            return false;
        }
        if (secuencia.charAt(0) != 'X' || secuencia.charAt(4) != 'O'){
            return false;
        }
        return true;
    }
}
