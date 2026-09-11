package src.exercicios.modulo03.aula01;

public class Exercicio02 {

    public static void main(String[] args) {

        Cofrinho c = new Cofrinho();

        c.depositar(50);
        c.depositar(-1000);

        System.out.println("Saldo: " + c.getSaldo());
    }
}