package src;

public abstract class Tarefa {

    // ATRIBUTOS
    private String nome;
    private String descricao;
    private int prioridade;
    private String responsavel;
    private double horasEstimadas;
    private TarefaStatus status;

    // CONSTRUTOR COM ARGUMENTOS
    public Tarefa(String nome, String descricao, int prioridade, String responsavel,
                  double horasEstimadas, TarefaStatus status) {
        this.nome = nome;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.responsavel = responsavel;
        this.horasEstimadas = horasEstimadas;
        this.status = status;
    }

    // CONSTRUTOR COM TÍTULO
    public Tarefa(String titulo) {
        this.nome = titulo;
    }

    // MÉTODOS ABSTRATOS
    public abstract String tipo();

    public abstract String resumo();

    // MÉTODOS ACESSÓRIOS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public TarefaStatus getStatus() {
        return status;
    }

    public void setStatus(TarefaStatus status) {
        this.status = status;
    }
}