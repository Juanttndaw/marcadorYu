package Ejerciciostem2;

import java.util.Scanner;

public class Etres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int num;

        System.out.print("Dime un numero: ");
        num = sc.nextInt();

        sc.nextLine();

        String resultado = num % 2 == 0 ? "Es par" : "Es impar";

        System.out.println(resultado);

        sc.close();




    }
}
