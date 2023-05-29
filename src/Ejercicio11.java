
import java.util.Scanner;


public class Ejercicio11 {  
    public static void main(String[] args) {
        String entrada;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra");
        entrada = leer.nextLine();
        if (entrada.endsWith(".")){
                String retorno = codificarEntrada(entrada);
                System.out.println("La codificacion correspondiente es:" );
                System.out.println(retorno);
        } else {
            System.out.println("la secuencia debe terminar en punto.");
        }
    
    }
    public static String codificarEntrada(String secuencia) {
        String resultado = " ";
        
        for (char i : secuencia.toCharArray()) {
            switch (Character.toLowerCase(i)) {
                case 'a':
                    resultado = resultado.concat("@");
                    break;
                case 'e':
                    resultado = resultado.concat("#");
                    break;
                case 'i':
                    resultado = resultado.concat("$");
                    break;
                case 'o':
                    resultado = resultado.concat("%");
                    break;
                case 'u':
                    resultado = resultado.concat("&");
                    break;
                default:
                    resultado = resultado.concat(String.valueOf(i));
            }
        }
        return resultado;
    }
}
