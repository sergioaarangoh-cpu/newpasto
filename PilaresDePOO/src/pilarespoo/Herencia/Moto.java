package PilaresDePOO.src.pilarespoo.Herencia;

public class Moto extends Vehiculos {
    private int cilindraje;
    private boolean tieneGas;


    public Moto(int cilindraje, boolean tieneGas ) {
        this.cilindraje = cilindraje;
        this.tieneGas = tieneGas ;
    }

    public Moto(String marca, String modelo, int cilindraje, boolean tieneGas) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
        this.tieneGas = tieneGas;
    }

    public void abrirDeposito(){
        System.out.println("Depósito de combustible abierto");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }

    public void checkGas() {
        if (tieneGas == false) {
            System.out.println("El depósito de gasolina está vacío");
            System.out.println("Rellenando depósito...");
            System.out.println("... ");
            System.out.println("El depósito de gasolina está lleno, ¡Feliz viaje!");
            tieneGas = true;
            }else{
            System.out.println("El depósito de gasolina está lleno, ¡Feliz viaje!");

        }
    }
}

