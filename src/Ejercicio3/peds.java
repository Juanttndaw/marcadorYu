package Ejercicio3;

import java.util.Scanner;

public class peds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*try {
            System.out.println("dime el num 1: ");
            int num1 = sc.nextInt();
            System.out.println("dime el num 2: ");
            int num2 = sc.nextInt();
            System.out.println(num1 / num2);


        }catch (ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }
        */

        try {
            int[] rayma = {55,3,2,66,42};
            for (int i = 0; i < rayma.length; i++) {
                System.out.println(rayma[i]);
            }


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Te has salido del array");
        }finally {
            System.out.println("Programa terminado");
        }







    }



}
