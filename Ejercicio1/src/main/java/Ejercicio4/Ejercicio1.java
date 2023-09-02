package Ejercicio4;

import java.util.Scanner;

public class Ejercicio1 {
   
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       int numA,numB;
        System.out.println("Ingrese el primer numero: ");
        numA=scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numB=scanner.nextInt();

            if ((numA > 0 && numB > 0) || (numA < 0 && numB < 0)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
    }
    
}
