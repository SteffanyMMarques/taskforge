package br.com.docodigoaocontrato.taskforge.controller;

import br.com.docodigoaocontrato.taskforge.dto.TarefaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TarefaController {

    @GetMapping("/tarefas/todas")
    public List<TarefaDTO> listarTodas() {
        List<TarefaDTO> tarefas = new ArrayList<>();

        tarefas.add(new TarefaDTO(1, "Estudar Java", 1, false));
        tarefas.add(new TarefaDTO(2, "Revisar PR", 2, true));
        tarefas.add(new TarefaDTO(3, "Subir a API", 1, false));

        return tarefas;
    }
}