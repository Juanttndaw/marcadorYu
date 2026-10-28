import java.util.Scanner;

public class LeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var animal1 = new Animal("Perro",14);
        var animal2 = new Perro("Gato", 9);
        var animal3 = new Gato("Pez", 0);
        Animal[] animals = new Animal[3];
        animals[0] = animal1;
        animals[1] = animal2;
        animals[2] = animal3;
        var animal4 = new Perro("Perro1", 3, "labrador");




        animal1.hacerSonido();
        System.out.println(" ");
        System.out.println("Es Cachorro?: " + animal1.esCachorro());
        System.out.println("Es Cachorro?: " + animal2.esCachorro());
        System.out.println("Es Cachorro?: " + animal3.esCachorro());

        for (int i = 0; i < animals.length; i++) {

            animals[i].hacerSonido();


        }

        System.out.println(animal4);



    }
}
