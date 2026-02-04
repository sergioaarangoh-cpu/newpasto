package PilaresDePOO.src.pilarespoo.Encapsulamiento;

public class Main {
    public static void main(String[] args){
        CuentaBancaria cuentaNu = new CuentaBancaria("12345678901234", "Johann Alfreiro de la Cruz");
        cuentaNu.depositar(9999999999.9);
        System.out.println("Saldo: " + cuentaNu.getSaldo());
        System.out.println("-----------");
        cuentaNu.retirar(1);
        System.out.println("Saldo: " + cuentaNu.getSaldo());
    }
}
