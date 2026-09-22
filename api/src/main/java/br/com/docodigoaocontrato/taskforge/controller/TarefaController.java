package br.com.docodigoaocontrato.taskforge.controller;

import br.com.docodigoaocontrato.taskforge.dto.TarefaDTO;
import br.com.docodigoaocontrato.taskforge.model.Tarefa;
import br.com.docodigoaocontrato.taskforge.repository.TarefaRepository;
import br.com.docodigoaocontrato.taskforge.service.TarefaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TarefaController {

    private final TarefaService tarefaService;
    private final TarefaRepository tarefaRepository;

    public TarefaController(TarefaService tarefaService, TarefaRepository tarefaRepository) {
        this.tarefaService = tarefaService;
        this.tarefaRepository = tarefaRepository;
    }

    @GetMapping("/tarefas")
    public List<TarefaDTO> listar() {

        return tarefaService.buscarTodos();
    }

//    @GetMapping("/tarefas/pendentes")
//    public List<TarefaDTO> listarPendentes() {
//        return tarefaService.buscarTodos()
//                .stream()
//                .filter(tarefa -> !tarefa.isConcluida())
//                .map(TarefaDTO::new)
//                .toList();
//    }

    @GetMapping("/tarefas/total")
    public long contarTotal() {
        return tarefaRepository.count();
    }

    @PostMapping("/tarefas")
    public ResponseEntity<TarefaDTO> criarTarefa(@RequestBody TarefaDTO tarefaDTO) {
        TarefaDTO tarefaCriada = tarefaService.criarTarefa(tarefaDTO);
                return ResponseEntity.status(HttpStatus.CREATED).body(tarefaCriada);
    }
}