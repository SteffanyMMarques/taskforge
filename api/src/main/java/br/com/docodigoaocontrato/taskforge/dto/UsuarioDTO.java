package br.com.docodigoaocontrato.taskforge.dto;

import br.com.docodigoaocontrato.taskforge.model.Usuario;

public class UsuarioDTO {
    private Long id;
    private String nome;
    private String email;
    private boolean ativo;

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.ativo = usuario.isAtivo();
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public boolean isAtivo() { return ativo; }
}