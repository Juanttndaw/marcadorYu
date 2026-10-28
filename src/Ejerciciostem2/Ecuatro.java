package Ejerciciostem2;

import java.util.Scanner;

public class Ecuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int edad;

        System.out.print("Dime tu edad: ");
        edad = sc.nextInt();

        sc.nextLine();

        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }

        String resultado = edad >= 18 ? "Es mayor de edad" : "Es menor de edad";

        System.out.println(resultado);

        sc.close();


    }
}
