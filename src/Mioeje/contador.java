package Mioeje;

import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int contador = 10;
        int num;

        System.out.println("Ejercicio 1. Contador de números pares e impares");
        System.out.println("--------------------------------------");


        for (int i = 1; i <= contador; i++) {
            System.out.println("Dime el numro " + i + ":");
            num = sc.nextInt();


            if (num % 2 == 0){
                System.out.println("Es par");
                pares++;
            }else {
                System.out.println("Es impar");
                impares++;
            }



        }

        System.out.println("Estos son los numeros pares: " + pares);
        System.out.println("Estos son los numeros impares: " + impares);










    }
}
