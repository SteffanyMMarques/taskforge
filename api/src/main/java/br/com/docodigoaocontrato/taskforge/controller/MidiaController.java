package br.com.docodigoaocontrato.taskforge.controller;

import br.com.docodigoaocontrato.taskforge.dto.MidiaDTO;
import br.com.docodigoaocontrato.taskforge.dto.Genero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MidiaController {

    @GetMapping("/midias/exemplo")
    public MidiaDTO obterExemplo() {
        return new MidiaDTO("Duna", 8.7, Genero.ACAO, 155);
    }
}