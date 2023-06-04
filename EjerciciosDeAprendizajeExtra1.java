package introjavanotebook;

import java.util.Scanner;


public class EjerciciosDeAprendizajeExtra1 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tiempoMinutos;
        System.out.println("Ingrese el tiempo en minutos");
        tiempoMinutos = leer.nextInt();
        int tiempoDia = tiempoMinutos / 1440;
        int tiempoHoras = (tiempoMinutos % 1440)  / 60;
        System.out.println(tiempoDia + " día " + tiempoHoras + " horas.");
    }
}