public class Perro extends Animal {
    private String raza;

    public String getRaza() {
        return raza;
    }
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public Perro(String nombre) {
        super(nombre);
    }

    public Perro(int edad) {
        super(edad);
    }

    @Override
    public String toString() {
        return "Perro: " + getNombre() +" raza: " + getRaza() + " edad: " + getEdad();
    }

    @Override
    public void hacerSonido(){
        System.out.println(" Guau guau ");
    }
    
}
