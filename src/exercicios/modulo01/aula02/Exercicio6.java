package src.exercicios.modulo01.aula02;

public class Exercicio6 {

    public static void main(String[] args) {

        int numero = Integer.parseInt(IO.readln("Me informe um número: "));
        int soma = 0;
        for (int aux = 1; aux <= numero; aux++) {
            soma = soma + aux;
        }

        IO.println("A soma de 1 até " + numero + " é " + soma);
    }
}