package src.exercicios.modulo01.aula02;

public class Exercicio3 {

    public static void main(String[] args) {

        String senha;

        do {
            senha = IO.readln("Senha: ");
        } while (!senha.equals("java123"));

        System.out.println("Acesso liberado!");
    }
}
