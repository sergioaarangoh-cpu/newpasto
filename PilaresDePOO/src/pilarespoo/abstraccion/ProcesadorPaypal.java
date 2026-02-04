package PilaresDePOO.src.pilarespoo.abstraccion;

public class ProcesadorPaypal extends ProcesadorPago {
    private String email;
    private String password;

    public ProcesadorPaypal (double monto, String moneda){
        super (monto, moneda);
    }

    public ProcesadorPaypal(double monto, String moneda, String email, String password) {
        super(monto, moneda);
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean procesarPago() {
        System.out.println("Procesando pago con paypal con el correo: "+ email);
        return true;
    }

    @Override
    public boolean validarDatos() {

        return email != null && email.contains("@") && email.length() >= 10
                && !password.isEmpty();
    }
}
