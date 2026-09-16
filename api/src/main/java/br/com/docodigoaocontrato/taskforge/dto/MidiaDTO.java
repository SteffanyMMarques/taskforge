package br.com.docodigoaocontrato.taskforge.dto;

public class MidiaDTO {
    private String titulo;
    private double nota;
    private Genero genero;
    private int duracaoMin;

    public MidiaDTO(String titulo, double nota, Genero genero, int duracaoMin) {
        this.titulo = titulo;
        this.nota = nota;
        this.genero = genero;
        this.duracaoMin = duracaoMin;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getNota() {
        return nota;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }
}