package Ejerciciostem2;

import java.util.Scanner;

public class Euno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Dime un numero: ");
        num = sc.nextInt();

        if (num >= 0) {
            System.out.println("El número " + num + " es positivo");
        }else {
            System.out.println("El número " + num + " es negativo");
        }
        sc.close();
















    }
}
