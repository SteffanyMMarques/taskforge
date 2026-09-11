package src.exercicios.modulo02.aula02;

import src.Notificavel;
import src.Tarefa;

public class TarefaRecorrente extends Tarefa implements Notificavel {

    private int vezesPorSemana;

    public TarefaRecorrente(String titulo, int vezesPorSemana) {
        super(titulo);
        this.vezesPorSemana = vezesPorSemana;
    }

    @Override
    public String tipo() {
        return "TAREFA RECORRENTE";
    }

    @Override
    public String resumo() {
        return getNome() + " - toda semana, " + vezesPorSemana + "x";
    }

    @Override
    public void notificar() {
        System.out.println(
                "Lembrete: A tarefa recorrente '" + getNome() + "' precisa ser feita."
        );
    }
}