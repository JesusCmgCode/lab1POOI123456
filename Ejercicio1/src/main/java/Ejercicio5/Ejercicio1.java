package Ejercicio5;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner semana = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
            int numDia=semana.nextInt();
   
            if (numDia == 1) {
                System.out.print("Lunes");
            } else if (numDia == 2) {
                System.out.print("Martes");
            } else if (numDia == 3) {
                System.out.print("Miercoles");
            } else if (numDia == 4) {
                System.out.print("Jueves");
            } else if (numDia == 5) {
                System.out.print("Viernes");
            } else if (numDia == 6) {
                System.out.print("Sabado");
            } else if (numDia == 7) {
                System.out.print("Domingo");
            } else{ 
                System.out.println("No existe ese dia");
            }
        }
    }

