package Ejerciciostem2;

import java.util.Scanner;

public class Esiete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;


        System.out.print("Dime un numero: ");
        num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("es múltiplo de 3 y de 5 a la vez.");
        }else {
            System.out.println("no cumple la condición.");
        }


    }
}
