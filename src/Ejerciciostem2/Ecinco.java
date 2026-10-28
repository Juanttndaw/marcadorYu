package Ejerciciostem2;

import java.util.Scanner;

public class Ecinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int num1;
        int num2;

        System.out.print("numero uno: ");
        num1 = sc.nextInt();
        System.out.print("numero dos: ");
        num2 = sc.nextInt();

        sc.nextLine();

        if (num1 > num2){
            System.out.println("El numero 1 es mayor: " + num1) ;
        } else if (num2 > num1) {
            System.out.println("El numero 2 es mayor: " + num2) ;
        }else {
            System.out.println("Los dos numeros son iguales: " + num1 + " = " + num2);
        }


        sc.close();
    }
}
