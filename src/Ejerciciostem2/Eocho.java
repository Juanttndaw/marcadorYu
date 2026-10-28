package Ejerciciostem2;

import java.util.Scanner;

public class Eocho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;


        System.out.print("Dime un año bisiesto: ");
        num = sc.nextInt();

        if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0){
            System.out.println("Es un año bisiesto");
        }else {
            System.out.println("No es un año bisiesto");
        }


    }
}
