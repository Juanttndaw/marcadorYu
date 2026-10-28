import java.util.Scanner;

public class OpLogicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean X = true , Y = false, Z = true;

        /*Importante conor la tabla de verdad de || (OR), &&(AND) Y
        !(NOT) asi como la precedencia de operadores */

        System.out.print("Resurtado1: ");
        System.out.println((X && Y) || (X && Z));

        System.out.print("Resurtado2: ");
        System.out.println(!X || !Y || Z && X && !Y);

        System.out.print("Resurtado3: ");
        System.out.println(!X && Y && (!Z || !X));

        System.out.print("Resurtado4: ");
        System.out.println(X || Y && !Z || !X);





    }
}
