import java.util.Scanner;

public class Ejercicio1 {


    public static String cadenaH(int altura) throws IllegalArgumentException{

        if (altura <= 5 || altura % 2 == 0){
            throw new IllegalArgumentException("altura no valida (mayor de 5 e impar)");
        }

        StringBuilder sb = new StringBuilder();
        int mitad = altura / 2;

        for (int fila = 0; fila < altura; fila++){

            for (int col = 0; col < altura ; col++) {

                boolean esVertical = (col == 0 || col == altura - 1);

                boolean esHorizontal = (fila == mitad);


                if (esVertical || esHorizontal){
                    sb.append('*');
                }else {
                    sb.append(' ');
                }



            }

            sb.append("\n");
        }



        return sb.toString();
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        while (!correcto){
            try {

                System.out.println("Introduce la altura (mayor de 5 impar): ");
                int altura = Integer.parseInt(sc.nextLine());

                String h = cadenaH(altura);

                System.out.println("\n" + h);
                correcto = true;

            }catch (NumberFormatException e){

                System.out.println("Error: debe introducir un numero entero.");

            }catch (IllegalArgumentException e){

                System.out.println("Error: " + e.getMessage());

            }

        }



        sc.close();

    }



}
