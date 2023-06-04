package introjavanotebook;

import java.util.Scanner;

public class EjercicioDeAprendizajeExtra5 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char claseSocio;
        double costoTratamiento;
        double importeAPagar;
        System.out.println("ingrese la clase del socio: (A,B,C): ");
        claseSocio = leer.next().charAt(0);
        System.out.println("Ingrese el costo del tratamiento: ");
        costoTratamiento = leer.nextInt();
      if (claseSocio == 'A'){
          importeAPagar = costoTratamiento * 0.5;
      } else if (claseSocio == 'B'){
          importeAPagar = costoTratamiento * 0.65;
      } else if (claseSocio == 'C'){
          importeAPagar = costoTratamiento;
      } else {
          System.out.println("Clase de socio invalida.");
          return;
      }
        System.out.println("Importe en efectivo a pagar :" + importeAPagar);
    }
    
}
