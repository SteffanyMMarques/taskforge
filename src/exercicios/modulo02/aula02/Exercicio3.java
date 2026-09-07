package src.exercicios.modulo02.aula02;

class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom() {
        IO.println(nome + ": ...");
    }
}

class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);

    }

    @Override
    public void fazerSom() {
        IO.println(nome + ": Au au");
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Rex");
        c.fazerSom();
    }
}