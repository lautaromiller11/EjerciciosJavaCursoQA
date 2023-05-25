import java.util.Scanner;


public class Ejercicio13y14 {

  
    public static void main(String[] args) {
        
         int cantidadEquipo;
         System.out.println("Ingrese la cantidad de compañeros en su equipo:");
         Scanner leer = new Scanner(System.in);
         cantidadEquipo = leer.nextInt();
       String [ ] equipo = new String [cantidadEquipo];
       for (int i =  0; i < cantidadEquipo; i ++){
           System.out.println("Ingrese el nombre del compañero/a " + (i) + ": ");
           equipo[ i ] = leer.next();
       }
        System.out.println("Los nombres de sus compañeros son:");
        for (int i = 0; i < cantidadEquipo; i ++) {
        System.out.println(equipo[ i ]);
    }
    }
    
}