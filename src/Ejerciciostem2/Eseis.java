package Ejerciciostem2;

import java.util.Scanner;

public class Eseis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0;


        System.out.print("Dime un numero: ");
        num1 = sc.nextDouble();

        if (num1 >= 300){
            double impuestos = num1 * 0.05;
            System.out.println("impuesto de 5%: " + impuestos + "$" + "\n" + "Precio: " + (num1 + impuestos) + "$");
        }else {
            System.out.println("libre de impuestos" + "\n" + "Precio: " + num1 + "$");
        }


    }
}
