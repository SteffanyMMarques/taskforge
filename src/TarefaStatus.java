package src;

public enum TarefaStatus {

    PENDENTE("Pendente"),
    EM_ANDAMENTO("Em andamento"),
    CONCLUIDA("Concluída"),
    CANCELADA("Cancelada");

    private String descricao;

    TarefaStatus(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}