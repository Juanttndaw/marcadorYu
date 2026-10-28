public class Gato extends Animal{

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public Gato(String nombre) {
        super(nombre);
    }

    public Gato(int edad){
        super(edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println(" Miau ");
    }


}
