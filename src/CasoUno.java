import java.util.Scanner;
import java.util.stream.Stream;

public class CasoUno {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        char[] sim = {'a','b','e','x','i','o','u','z'};
        int contar = 0;


        for (int i = 0; i < sim.length; i++) {
            char letra = sim[i];
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contar++;

            }
        }

        System.out.println("bocales: " + contar);



    }



}
