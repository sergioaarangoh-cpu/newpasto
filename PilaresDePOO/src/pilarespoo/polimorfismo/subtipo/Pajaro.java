package pilarespoo.polimorfismo.subtipo;

public class Pajaro implements IAnimal {
    private String nombre;
    private String especie;
    //Const parametros
    public Pajaro (String nombre, String especie) {
        this.nombre = nombre;
    }
    //const por defecto
    public Pajaro () {
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
        System.out.println(nombre + ": dice pio poo");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + ": vuela rapidamente");
    }

    @Override
    public void comer() {
        System.out.println(nombre + ": come frutas e insectos");
    }
}

