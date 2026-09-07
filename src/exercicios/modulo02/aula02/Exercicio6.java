abstract class Forma {
    abstract double area();
}

class Circulo extends Forma {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double area() {
        return 3.14 * raio * raio;
    }
}

class Quadrado extends Forma {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double area() {
        return lado * lado;
    }
}

public class Exercicio6 {
    public static void main(String[] args) {
        Forma circulo = new Circulo(2.0);
        Forma quadrado = new Quadrado(3.0);

        Forma[] formas = {circulo, quadrado };

        for (Forma f : formas) {
            System.out.println("Area: " + f.area());
        }
    }
}