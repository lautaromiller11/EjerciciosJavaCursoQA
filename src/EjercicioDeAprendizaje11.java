
import java.util.Scanner;


public class EjercicioDeAprendizaje11 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int opcion = 0;
        int sumar; 
        int restar;
        int multiplicar;
        int dividir;
        char confirmacion;
        System.out.println("Ingrese el primer numero entero: ");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        num2  = leer.nextInt();
        boolean salir = false;
        while (!salir) {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir"); 
            System.out.println("Elija una opcion: ");
            opcion = leer.nextInt();
            
            switch (opcion) {
            case 1:
                sumar = num1 + num2;
                System.out.println("Ha elegido la opcion de sumar. El resultado es :" + sumar);
                break;
            case 2: 
                restar = num1 - num2;
                System.out.println("Ha elegido la opcion de restar. El resultado es :" + restar);
                break;
            case 3:
                multiplicar = num1 * num2;
                System.out.println("Ha elegido la opcion de multiplicar. El resultado es :" + multiplicar);
                break;
            case  4:
                dividir = num1 / num2;
                System.out.println("Ha elegido la opcion de dvidir. El resultado es :" + dividir);
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                confirmacion = leer.next() .charAt(0);
                if (confirmacion == 's'){
                    salir = true;
                    System.out.println("Hasta luego!!");
                }
                break;
            default:
                    System.out.println("Opción inválida. Por favor, seleccione una opcion valida.");
                break;
        }
        }
    }
}
