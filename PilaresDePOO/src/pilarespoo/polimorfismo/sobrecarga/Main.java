package pilarespoo.polimorfismo.sobrecarga;

public class Main {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        calc.sumar(8, 6);
        calc.sumar(8, 6, 9);
    }
}
