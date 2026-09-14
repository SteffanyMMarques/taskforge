package src.exercicios.modulo03.aula01;

public class Cofrinho {

    private double saldo;

    public void depositar(double v) {
        if (v > 0) {
            saldo += v;
        } else {
            System.out.println("Depósito inválido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}