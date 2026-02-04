package PilaresDePOO.src.pilarespoo.abstraccion;

public abstract class ProcesadorPago {
    // Campos comunes
    protected double monto;
    protected String moneda;

    public ProcesadorPago(double monto, String moneda) {
        this.monto = monto;
        this.moneda = moneda;
    }

    // Método abstracto: las subclases DEBEN implementarlo
    public abstract boolean procesarPago();

    // Método abstracto: validación específica de cada procesador
    public abstract boolean validarDatos();

    // Método concreto: lógica compartida
    public void registrarTransaccion() {
        System.out.println("Transacción registrada: " + monto + " " + moneda);
    }

    // Template method: define el flujo, delega los pasos
    public final boolean ejecutarPago() {
        System.out.println("Iniciando proceso de pago...");

        if (!validarDatos()) {
            System.out.println("Datos inválidos");
            return false;
        }

        boolean exito = procesarPago();

        if (exito) {
            registrarTransaccion();
            System.out.println("Pago exitoso");
        } else {
            System.out.println("Pago fallido");
        }

        return exito;
    }
}
