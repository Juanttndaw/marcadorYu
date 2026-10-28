import java.util.Scanner;

public class OpAritmeticos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 8, b = 3, c = -5;

        System.out.print("Resultado1: ");
        System.out.println(a - 2 - c * 2);

        System.out.print("Resultado2: ");
        System.out.println(a % b);
        // operador modulo da como resultado el resto de la division de a y b

        System.out.print("Resultado3: ");
        System.out.println((a * c) % b);

        System.out.print("Resultado4: ");
        System.out.println((3 * a - 2 * b) % (2 *  - c));

    }
}
