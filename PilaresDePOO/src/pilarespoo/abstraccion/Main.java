package PilaresDePOO.src.pilarespoo.abstraccion;

public class Main {
    public static void main(String[] args){
        TiendaOnline tiendaPocoyo = new TiendaOnline();

        PilaresDePOO.src.pilarespoo.abstraccion.ProcesadorPago pagoTarjeta = new ProcesadorTarjeta
                (70000, "COP", "1234567890123456", "321");
        ProcesadorPago pagoPaypal = new ProcesadorPaypal
                (70000, "COP", "1234567890123456", "321");

        tiendaPocoyo.procesarCompra(pagoTarjeta);
        System.out.println("---");
        tiendaPocoyo.procesarCompra(pagoPaypal);


    }
}
