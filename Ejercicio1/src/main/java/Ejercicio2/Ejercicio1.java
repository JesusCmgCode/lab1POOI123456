package Ejercicio2;

import java.util.Scanner;

public class Ejercicio1 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
            int num=scanner.nextInt();
            if (num%2!=0 && num>=0){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            
    }
    
}
