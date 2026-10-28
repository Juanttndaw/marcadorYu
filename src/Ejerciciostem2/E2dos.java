package Ejerciciostem2;

import java.util.Random;
import java.util.Scanner;

public class E2dos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num1;
        int num2;



        System.out.print("Dime un numero[1]: ");
        num1 = sc.nextInt();
        System.out.print("Dime un numero[2]: ");
        num2 = sc.nextInt();

        if (num1 > num2 ){
            System.out.println("El numero[1] " + num1 + " es mayor que el numero[2] " + num2);
        } else if (num2 > num1 ) {
            System.out.println("El numero[2] " + num2 + " es mayor que el numero[1] " + num1);
        }else {
            System.out.println("Son iguales: " + num1 + " == " + num2);
        }


    }
}
