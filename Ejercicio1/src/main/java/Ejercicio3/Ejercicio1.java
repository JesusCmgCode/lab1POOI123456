package Ejercicio3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int num1,num2;
        System.out.println("Ingrese el primer numero: ");
        num1=scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2=scanner.nextInt();

            if (num1>=0 && num2>=0){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
    }
}
