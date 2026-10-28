package Ejerciciostem2;

import java.util.Random;
import java.util.Scanner;

public class E2cuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num1;




        System.out.print("Dime un numero[1]: ");
        num1 = sc.nextInt();


        if (num1 > 0){
            if (num1 % 2 == 0){
                System.out.println("numero positivo par");
            }else {
                System.out.println("numero positivo impar");
            }
        } else if (num1 < 0) {
            if (num1 % 2 == 0){
                System.out.println("numero negativo es Par");
            }else {
                System.out.println("numero negativo es impar");
            }
        }else{
            System.out.println("El número es cero");
        }


    }
}
