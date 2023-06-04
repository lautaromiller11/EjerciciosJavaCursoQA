
package introjavanotebook;
public class EjerciciosDeAprendizajeExtra2 {
    public static void main(String[] args) {
        // Asignamos las variables iniciales
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int auxiliar;
        // mostramos los valores iniciales:
        System.out.println("Los valores iniciales son: ");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
       
        System.out.println("///////////");
        
        // asignamos los valores invertidos:
        auxiliar = B;
        B = C;
        C = A;
        A = D;
        D = auxiliar;
        // mostramos los valores invertidos:
        System.out.println("Los valores finales son :");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }
    
}
