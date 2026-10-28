package Ejerciciostem2;

import java.util.Scanner;

public class Edos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Dime un numero: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par");
        }else {
            System.out.println("El número " + num + " es impar");
        }

        sc.close();








    }
}
