package src.exercicios.modulo01.aula02;

public class Exercicio5 {

    public static void main(String[] args) {

        double nota = Double.parseDouble(IO.readln("Nota final: "));

        if (nota >= 7) {
            System.out.println("Situação: Aprovado");
        } else if (nota >= 5) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
