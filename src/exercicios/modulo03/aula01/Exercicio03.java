package src.exercicios.modulo03.aula01;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {

    public static void main(String[] args) {

        List<String> compras = new ArrayList<>();

        compras.add("Arroz");
        compras.add("Feijão");
        compras.add("Café");
        compras.add("Pão");

        System.out.println("Total: " + compras.size());

        System.out.println("Primeiro: " + compras.get(0));
        System.out.println("Terceiro: " + compras.get(2));

        for (String item : compras) {
            System.out.println("- " + item);
        }
    }
}