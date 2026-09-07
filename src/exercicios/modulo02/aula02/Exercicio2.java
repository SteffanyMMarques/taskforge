package src.exercicios.modulo02.aula02;

public class Exercicio2 {

    enum Semaforo {
        VERMELHO, AMARELO, VERDE
    }

    public static String acao(Semaforo s) {
        return switch (s) {
            case VERMELHO -> "Pare";
            case AMARELO -> "Atenção";
            case VERDE -> "Siga";
        };
    }
        static void main(String[] args){
            System.out.println(acao(Semaforo.VERDE));
        }
    }