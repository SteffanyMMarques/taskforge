package src;

public class TarefaComPrazo extends Tarefa {

    double tempoLimite;

    public TarefaComPrazo(String nome, String descricao, int prioridade, String responsavel,
                          double horasEstimadas, TarefaStatus status, double tempoLimite) {
        super(nome, descricao, prioridade, responsavel, horasEstimadas, status);
        this.tempoLimite = tempoLimite;
    }

    @Override
    public String tipo() {
        return "TAREFA COM PRAZO";
    }

    @Override
    public String resumo() {
        return "Tarefa: " + getNome()
                + " - Descrição: " + getDescricao()
                + " - Prioridade: " + getPrioridade()
                + " - Responsável: " + getResponsavel()
                + " - Status: " + getStatus().getDescricao()
                + " - Tempo limite: " + tempoLimite;
    }
}