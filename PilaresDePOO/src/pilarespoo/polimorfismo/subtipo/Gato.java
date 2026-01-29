package pilarespoo.polimorfismo.subtipo;

public class Gato implements IAnimal {
    private String nombre;
//Const parametros
    public Gato(String nombre) {
        this.nombre = nombre;
    }
//const por defecto
    public Gato() {
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
        System.out.println(nombre + ": dice miau");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + ": camina sigilosamente");
    }

    @Override
    public void comer() {
        System.out.println(nombre + ": come carne");
    }
}
