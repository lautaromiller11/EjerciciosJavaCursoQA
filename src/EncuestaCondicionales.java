
import java.util.Scanner;


/**
 *
 * @author lauta
 */
public class EncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        
       int opinion;
       Scanner leer = new Scanner(System.in);
       System.out.println("Clasifique la peli de 1 a 5 estrellas");
       opinion = leer.nextInt();
       if (opinion >= 1 && opinion <= 5){
           switch (opinion){
               case 1:
               case 2:
                   System.out.println("Nos sentimos apenados que no hayas disfrutado la peli");
                   break;
               case 3:
                   System.out.println("has calificado la peli como buena");
                   break;
               case 4:
                   System.out.println("has calificado la peli como muy buena");
                   break;
               case 5: 
                   System.out.println("Fantastico que hayas disfrutado de una buena peli bro");
                   break;
           }
       } else if (opinion < 0) {
           System.out.println("una opinion negativa? tan mala fue la pelicula??");
       } else if (opinion == 0){
           System.out.println("el valor " + opinion + " no es valido y no se tomara en cuenta");
       } else {
           System.out.println("Wow!!! se te fue la mano con la calificacion brother");
       }
       System.out.println("hasta la proxima amigo");
    }
    
}
