class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double salarioAnual() {
        return salario * 12;
    }
}

class Gerente extends Funcionario {
    double bonusAnual;

    public Gerente(String nome, double salario, double bonusAnual) {
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double salarioAnual() {

        return super.salarioAnual() + bonusAnual;
    }
}

public class Exercicio5 {
    public static void main(String[] args) {

        Funcionario ana = new Funcionario("Ana", 3000.0);


        Gerente bruno = new Gerente("Bruno", 5000.0, 10000.0);


        System.out.println(ana.nome + ": " + ana.salarioAnual());
        System.out.println(bruno.nome + ": " + bruno.salarioAnual());
    }
}