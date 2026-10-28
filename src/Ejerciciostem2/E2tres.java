package Ejerciciostem2;

import java.util.Random;
import java.util.Scanner;

public class E2tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num1;
        int num2;
        int num3;



        System.out.print("Dime un numero[1]: ");
        num1 = sc.nextInt();
        System.out.print("Dime un numero[2]: ");
        num2 = sc.nextInt();
        System.out.print("Dime un numero[3]: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3 ){
            System.out.println("El numero[1] " + num1 + " es mayor que el numero[2] " + num2 + " y que numero[3] " + num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero[2] " + num2 + " es mayor que el numero[1] " + num1 + " y que numero[3] " + num3);
        }else if (num3 > num1 && num3 > num2){
            System.out.println("El numero[3] " + num3 + " es mayor que el numero[1] " + num1 + " y que numero[2] " + num2);
        }else {
            System.out.println("Es un empate!!!!");
        }


    }
}
