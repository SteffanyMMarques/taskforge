package br.com.docodigoaocontrato.taskforge.dto;

import br.com.docodigoaocontrato.taskforge.model.Categoria;

public class CategoriaDTO {
    private Long id;
    private String nome;

    public CategoriaDTO(Categoria categoria) {
        this.id = categoria.getId();
        this.nome = categoria.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

//    public String getDescicao() {
//        return descricao;
//    }
//
//    public String getAutor() {
//    }
}