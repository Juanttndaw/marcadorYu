package Mioeje;

import java.util.Scanner;

public class Calculadora {
    private double numero1;
    private double numero2;
    private String simbolos;




    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public String getSimbolos() {
        return simbolos;
    }

    public void verCal(double numero1,double numero2, String simbolos){
        var sc = new Scanner(System.in);

        switch (simbolos){
            case "+":
                System.out.println(numero1 + numero2);
                break;
            case "-":
                System.out.println(numero1 - numero2);
                break;
            case "*":
                System.out.println(numero1 * numero2);
                break;
            case "/":
                if (numero2 == 0) {
                    System.out.println("No se puede dividir entre 0");
                } else {
                    System.out.println(numero1 / numero2);
                }
                break;
            default:
                System.out.println("Operador no válido");
                break;
        }














    }


}
