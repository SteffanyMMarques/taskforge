package src.exercicios.modulo01.aula02;

public class Exercicio4 {

    public static void main(String[] args) {

        System.out.println("1 - Bom dia");
        System.out.println("2 - Boa tarde");
        System.out.println("3 - Boa noite");

        String op = IO.readln("Escolha: ");

        switch (op) {
            case "1" -> System.out.println("Bom dia!");
            case "2" -> System.out.println("Boa tarde!");
            case "3" -> System.out.println("Boa noite!");
            default -> System.out.println("Opção inválida");
        }
    }
}