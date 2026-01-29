package pilarespoo.polimorfismo.subtipo;

public class Perro implements IAnimal {
    private String nombre;
    private int edad;

    //Const parametros
    public Perro (String nombre, int edad) {
        this.nombre = nombre;
    }
    //const por defecto
    public Perro () {
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + ": dice guau");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + ": corre y ladra de forma ruidosa");
    }

    @Override
    public void comer() {
        System.out.println(nombre + ": come de todo");
    }
}
