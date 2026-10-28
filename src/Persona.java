public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean esMayorDeEdad(){
        boolean bo = false;
        if (getEdad() >= 18){
            bo = true;
        }
        return bo;
    }

    public static void main(String[] args) {

        var persona1 = new Persona("Juan", 8);
        var persona2 = new Persona("Maria", 26);




        System.out.println("nombre: " + persona1.nombre + ", años: " + persona1.edad);
        System.out.println(persona1.esMayorDeEdad());
        System.out.println("nombre: " + persona2.nombre + ", años: " + persona2.edad);
        System.out.println(persona2.esMayorDeEdad());



    }



}
