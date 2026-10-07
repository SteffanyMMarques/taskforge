package br.com.docodigoaocontrato.taskforge.dto;

import java.util.List;

public class CatalogoDTO {
    private String nomeDoCatalogo;
    private int total;
    private List<MidiaDTO> midias;

    public CatalogoDTO(String nomeDoCatalogo, List<MidiaDTO> midias) {
        this.nomeDoCatalogo = nomeDoCatalogo;
        this.midias = midias;

        this.total = (midias != null) ? midias.size() : 0;
    }

    public String getNomeDoCatalogo() {
        return nomeDoCatalogo;
    }

    public int getTotal() {
        return total;
    }

    public List<MidiaDTO> getMidias() {
        return midias;
    }
}