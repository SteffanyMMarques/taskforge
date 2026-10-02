package br.com.docodigoaocontrato.taskforge.controller;

import br.com.docodigoaocontrato.taskforge.repository.CategoriaRepository;
import br.com.docodigoaocontrato.taskforge.dto.CategoriaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriaController {

    private final CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping("/categorias")
    public List<CategoriaDTO> listar() {
        return categoriaRepository.findAll()
                .stream()
                .map(CategoriaDTO::new)
                .toList();
    }
}