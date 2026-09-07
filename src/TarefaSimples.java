package src;

public class TarefaSimples extends Tarefa {

    public TarefaSimples(String nome, String descricao, int prioridade, String responsavel,
                         double horasEstimadas, TarefaStatus status) {
        super(nome, descricao, prioridade, responsavel, horasEstimadas, status);
    }

    @Override
    public String tipo() {
        return "TAREFA SIMPLES";
    }

    @Override
    public String resumo() {
        return "Tarefa: " + getNome()
                + " - Descrição: " + getDescricao()
                + " - Prioridade: " + getPrioridade()
                + " - Responsável: " + getResponsavel()
                + " - Status: " + getStatus().getDescricao();
    }
}