void main() {
    String nomeDaTarefa = "Estudar Java";
    int prioridade = 1;
    boolean concluida = false;
    String responsavel = IO.readln("Responsavel");
    String horasTexto = IO.readln("Horas estimadas: ");
    double horasEstimadas = Double.parseDouble(horasTexto);
    IO.println("Tarefa: " + nomeDaTarefa);
    IO.println("Prioridade: " + prioridade);
    IO.println("Responsavel: " + responsavel);
    IO.println("Concluída? " + concluida);
    IO.println("Horas estimadas: " + horasEstimadas);
}
