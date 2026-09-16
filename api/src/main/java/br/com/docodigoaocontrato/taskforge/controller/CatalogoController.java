package br.com.docodigoaocontrato.taskforge.controller;

import br.com.docodigoaocontrato.taskforge.dto.CatalogoDTO;
import br.com.docodigoaocontrato.taskforge.dto.Genero;
import br.com.docodigoaocontrato.taskforge.dto.MidiaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CatalogoController {

    @GetMapping("/catalogo")
    public CatalogoDTO obterCatalogo() {
        List<MidiaDTO> midias = new ArrayList<>();
        midias.add(new MidiaDTO("Duna", 8.7, Genero.ACAO, 155));
        midias.add(new MidiaDTO("Café com Código", 9.1, Genero.TECNOLOGIA, 28));
        midias.add(new MidiaDTO("Tropa de Elite", 8.0, Genero.ACAO, 115));

        return new CatalogoDTO("StreamFlix", midias);
    }
}