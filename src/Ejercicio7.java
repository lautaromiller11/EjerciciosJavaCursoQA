
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        int tipoMotor = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique que tipo de motor tiene ingresando un numero del 1 al 4");
        tipoMotor = leer.nextInt();
        if (tipoMotor >= 1 && tipoMotor <= 4) {
            switch (tipoMotor) {
                case 1:
                    System.out.println("La bomba es una bomba de agua.");
                    break;
                case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigon");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
            }
        }  else {
                System.out.println("No existe un valor valido para la bomba");
        }
    }

}
