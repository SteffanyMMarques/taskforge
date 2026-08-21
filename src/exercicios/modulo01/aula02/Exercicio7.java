package src.exercicios.modulo01.aula02;

public class Exercicio7 {

    public static void main(String[] args) {

        int secreto = 7;
        int palpite = 0;

        while (palpite != secreto) {

            palpite = Integer.parseInt(IO.readln("Digite seu palpite: "));

            if (palpite < secreto) {
                System.out.println("O número secreto é maior.");
            } else if (palpite > secreto) {
                System.out.println("O número secreto é menor.");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }
        }
    }
}
