
public class EjerciciosDeAprendizaje15 {

    public static void main(String[] args) {
        int [] numeros = new int [100];
        for (int i = 0 ; i < 100; i ++){
            numeros[i] = 100 - i;
        }
        System.out.println("numeros en orden descendente:");
        for (int i = 0; i <100; i++){
            System.out.println((numeros[i]));
        }
    }
    
}
