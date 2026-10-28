package Ejerciciostem2;

import java.util.Random;
import java.util.Scanner;

public class E2uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num;

        int randomNum= rand.nextInt(11);

        System.out.print("Dime un numero: ");
        num = sc.nextInt();

        if (num < randomNum){
            System.out.println("Tu número es menor");
        } else if (num > randomNum) {
            System.out.println("Tu número es mayor");
        }else {
            System.out.println("¡¡¡¡Premio!!!!");
        }


    }
}
