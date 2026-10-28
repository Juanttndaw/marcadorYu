package Mioeje;

import java.util.Scanner;

public class Multiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 10;
        int num;
        int multi;

        System.out.println("Ejercicio 2. Validación de un número y tabla de multiplicar");
        System.out.println("--------------------------------------");

        do {
            System.out.print("Dime un número entero comprendido entre 1 y 100: ");
            num = sc.nextInt();
        }while (num > 100 || num < 1);

        System.out.println("--------------------------------------");
        System.out.println("tabla de multiplicar del " + num);
        System.out.println("--------------------------------------");

        for (int i = 1; i <= contador; i++) {

            multi = num * i;

            System.out.println(num + " x " + i + " = " + multi);
        }










    }
}
