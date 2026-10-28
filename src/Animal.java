import java.util.Scanner;

public class Animal {
    private String nombre;
    private int edad;


    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public  Animal(String nombre){
        this.nombre = nombre;
    }

    public  Animal(int edad){
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }


    public void hacerSonido(){
        System.out.println(" Hace un sonido genérico ");
    }



    public boolean esCachorro(){
        boolean cachorro = false;
        if (getEdad() < 1){
            cachorro = true;
        }
        return cachorro;
    }


}
