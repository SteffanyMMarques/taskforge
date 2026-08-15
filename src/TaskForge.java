void main() {
    String nomeDaTarefa = IO.readln("Digite o nome da Tarefa: ");
    int prioridade = Integer.parseInt(IO.readln("Digite a prioridade da tarefa: "));
    boolean concluida = false;
    int opcao;
    do {
        IO.println("A tarefa está concluída?: ");
        IO.println("1 - sim");
        IO.println("2 - não");
        opcao = Integer.parseInt(IO.readln("Escolha uma opção 1 ou 2: "));
        if(opcao != 1 && opcao != 2) {
           IO.println("Opção inválida: ");
        }
    } while (opcao != 1 && opcao != 2);
    String responsavel = IO.readln("Digite o nome do responsável pela tarefa: ");
    double horasEstimadas = Double.parseDouble(IO.readln("Digite as horas estimadas da tarefa: "));
    IO.println("Tarefa: " + nomeDaTarefa);
    IO.println("Prioridade: " + prioridade);
    IO.println("Responsavel: " + responsavel);
    IO.println("Concluída? " + concluida);
    IO.println("Horas estimadas: " + horasEstimadas);
}
