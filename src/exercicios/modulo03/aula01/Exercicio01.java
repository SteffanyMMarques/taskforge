package src.exercicios.modulo03.aula01;

public class Exercicio01 {

    public static void main(String[] args) {

        Turno t = Turno.TARDE;

        System.out.println("Turno: " + t.getDescricao());
        System.out.println("Sem o getter: " + t);
    }
}