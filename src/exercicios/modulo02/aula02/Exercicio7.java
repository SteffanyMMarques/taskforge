interface Descontavel {
    double desconto();
}

class Livro implements Descontavel {
    @Override
    public double desconto() {
        return 0.10;
    }
}

class Eletronico implements Descontavel {
    @Override
    public double desconto() {
        return 0.05;
    }
}

public class Exercicio7 {
    public static void main(String[] args) {
        Descontavel livro = new Livro();
        Descontavel eletronico = new Eletronico();

        Descontavel[] itensDescontaveis = { livro, eletronico };

        for (Descontavel item : itensDescontaveis) {
            System.out.println("Desconto: " + item.desconto());
        }
    }
}