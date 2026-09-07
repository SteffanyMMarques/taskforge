public class Exercicio1 { // Mudou aqui
    private int valor = 0;

    public void incrementar() {
        valor++;
    }

    public int getValor() {
        return valor;
    }

    public static void main(String[] args) {

        Exercicio1 meuContador = new Exercicio1();

        meuContador.incrementar();
        meuContador.incrementar();
        meuContador.incrementar();

        System.out.println("Valor: " + meuContador.getValor());
    }
}