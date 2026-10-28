package Ejerciciostem2;

import java.util.Random;
import java.util.Scanner;

public class E2trece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int edad;




        System.out.print("Dime tu edad: ");
        edad = sc.nextInt();


        if (edad < 0) {
            System.out.println("Edad negativa error!!!!");
        } else if (edad <= 12) {
            System.out.println("0-12 - Niño");
        } else if (edad <= 17) {
            System.out.println("13-17 - Adolescente");
        } else if (edad <= 64) {
            System.out.println("18-64 - Adulto");
        } else {
            System.out.println("65 o mas - Mayor");
        }


    }
}
