public class Exercicio4 {

    static class Animal {
        String nome;

        Animal(String nome) {
            this.nome = nome;
        }

        void fazerSom() {
            System.out.println(nome + ": Som");
        }
    }

    static class Cachorro extends Animal {

        Cachorro(String nome) {
            super(nome);
        }

        @Override
        void fazerSom() {
            System.out.println(nome + ": Au au");
        }
    }

    static class Gato extends Animal {

        Gato(String nome) {
            super(nome);
        }

        @Override
        void fazerSom() {
            System.out.println(nome + ": Miau");
        }
    }

    public static void main(String[] args) {

        Animal[] animais = {
                new Cachorro("Rex"),
                new Gato("Mimi")
        };

        for (Animal a : animais) {
            a.fazerSom();
        }
    }
}