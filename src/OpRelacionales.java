import java.util.Scanner;

public class OpRelacionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 8, j = 5;
        float x = 0.05f, y = -0.1f;

        /* DIFERENCIA ENTRE EL OPERADOR DE ASIGNACIÓN = Y EL OPERADOR DE IGUALDAD ==.

        = asigna a la izquierda el valor de la derecha (ejemplo: var = 5, ahora var
        pasa a valer 5).

        == compara entre lo que tiene a ambos lados, si son iguales tiene valor true,
        si no false (ejemplo: la expresión (var == 7) tiene valor false)
        */

        /*Importante conocer la tabla de verdad de ||(OR), &&(AND) y !(NOT)
        así como la precedencia de operadores*/

        System.out.print("Resultado1: ");
        System.out.println(i <= j);

        System.out.print("Resultado2: ");
        System.out.println(x > y || x > 0);

        System.out.print("Resultado3: ");
        System.out.println(2 * x + y == 0);









    }
}
