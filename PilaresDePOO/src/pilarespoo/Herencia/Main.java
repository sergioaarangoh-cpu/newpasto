package PilaresDePOO.src.pilarespoo.Herencia;

public class Main {
    public static void main(String[] args){
        Moto nuevaMoto = new Moto("Honda", "fdkjnfkdjn", 800, false);
        Carro nuevoCarro = new Carro("Hyundai", "Tucson", 4, false);
        System.out.println("-------------------------------");
        nuevaMoto.abrirDeposito();
        nuevaMoto.checkGas();
        System.out.println("--------------------------------");
        nuevoCarro.abrirMaletero();
    }
}
