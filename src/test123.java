import java.util.Scanner;

public class test123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 10, par = 0;



        while (i >= 0) {

            if (i % 2 == 0) {

                par = par + i;

            }

            System.out.print(par + " ");

            i -= 2;

        }







    }
}
