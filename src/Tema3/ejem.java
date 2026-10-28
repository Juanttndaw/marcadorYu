package Tema3;

import java.util.Scanner;

public class ejem {

    static int suma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    static void  suma(int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println(resultado);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = suma(5, 3);
        System.out.println(total); // 8
        suma(3,2,3);




    }



}
