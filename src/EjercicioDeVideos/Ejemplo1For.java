package EjercicioDeVideos;

import java.util.Scanner;

public class Ejemplo1For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int VALOR_INICIAL = 10; // limite inferior de tabla
        final int VALOR_Final = 100; // limite inferior de tabla
        final int PASO = 10; // limite inferior de tabla
        int fah; //fahrenheit
        double cel; //celsius

        System.out.println("Fahrenheit \t Celsius");

        for (fah = VALOR_INICIAL; fah <= VALOR_Final; fah = fah + PASO) {
            cel = 5 * (fah - 32) / 9.0;
            System.out.println( fah + "\t" + cel);
        }




    }
}
