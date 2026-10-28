package Mioeje;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean esPrimo = false;

        System.out.println("Ejercicio 4. Número primo");
        System.out.println("--------------------------------------");

        System.out.print("Dime un numero entero mayor que 1: ");
        num = sc.nextInt();


        if (num > 1){
            System.out.println("Numero primo");

        }else {
            System.out.println("Numero no primo");
        }






    }
}
