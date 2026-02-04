package PilaresDePOO.src.pilarespoo.Herencia;

public class Vehiculos {
    protected String marca;
    protected String modelo;
    protected int velocidadActual;

    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
    }

    public void acelerar(int incremento){
        velocidadActual += incremento;
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");

    }

    public void frenar(int incremento){
        velocidadActual = 0;
        System.out.println("Vehículo detenido.");

    }

    public void mostrarInfo() {
        System.out.println(marca + " " + modelo);
    }






}
