
import java.util.Scanner;


public class EjercicioDeAprendizaje14 {

    public static void main(String[] args) {
        double cantEuros;
        String moneda;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros que desea convertir: ");
        cantEuros = leer.nextDouble();
        System.out.println("Introduce la moneda a la que desea convertir (dolares, yanes, o libras");
        moneda = leer.next();
        convertirMoneda(cantEuros,  moneda);
    }
    public static void convertirMoneda(double cantEuros, String moneda){
        double conversion;
        String unidadMoneda;
        switch (moneda){
            case "dolares":
                conversion = cantEuros * 1.28611;
                unidadMoneda = "U$D";
                break;
            case "yenes":
                conversion = cantEuros * 129.852;
                unidadMoneda = "¥";
                break;
            case "libras":
                conversion = cantEuros * 0.86;
                unidadMoneda = "£";
                break;
            default:
                System.out.println("Moneda no valida. Introduce una moneda correcta.");
                return;
    }
        System.out.println(cantEuros+ "€ equivalen a " + conversion + " " + unidadMoneda);
    }
}
