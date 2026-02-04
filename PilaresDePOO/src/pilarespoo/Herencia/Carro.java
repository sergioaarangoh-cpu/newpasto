package PilaresDePOO.src.pilarespoo.Herencia;

public class Carro extends Vehiculos {
    private int numPuertas;
    private boolean tieneAC;


    public Carro(int numPuertas, boolean tieneAC) {
        this.numPuertas = numPuertas;
        this.tieneAC = tieneAC;
    }

    public Carro(String marca, String modelo, int numPuertas, boolean tieneAC) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
        this.tieneAC = tieneAC;
    }

    public void abrirMaletero(){
        System.out.println("Maletero abierto");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}
