package PilaresDePOO.src.pilarespoo.Encapsulamiento;

public class CuentaBancaria {
    // Atributos privados: nadie puede accederlos directamente
    private String numeroCuenta;
    private double saldo;
    private String titular;

    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;  // Toda cuenta inicia con saldo cero
    }

    // Método público con validación
    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto debe ser positivo");
            return false;
        }

        if (monto > saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        }

        saldo -= monto;
        return true;
    }

    // Método público con validación
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto debe ser positivo");
            return;
        }

        saldo += monto;
    }

    // Getter: acceso controlado de solo lectura
    public double getSaldo() {
        return saldo;
    }
}
