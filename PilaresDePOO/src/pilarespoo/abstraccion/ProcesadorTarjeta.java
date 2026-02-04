package PilaresDePOO.src.pilarespoo.abstraccion;

public class ProcesadorTarjeta extends ProcesadorPago{
    private String numTarjeta;
    private String cvv;

    public ProcesadorTarjeta (double monto, String moneda) {
        super (monto, moneda);
    }

    public ProcesadorTarjeta(double monto, String moneda, String numTarjeta, String cvv) {
        super(monto, moneda);
        this.numTarjeta = numTarjeta;
        this.cvv = cvv;
    }

    @Override
    public boolean procesarPago() {
        System.out.println("Procesando tarjeta ****" + numTarjeta.substring(12));
        return true;
    }

    @Override
    public boolean validarDatos() {
        return cvv.length() >= 3 && numTarjeta.length() >= 16;
    }
}
