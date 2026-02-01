package com.luiz.todo.controller;
import com.luiz.todo.entity.TarefaEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.luiz.todo.service.TarefaService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class TarefaController {
    // tarefaService = instancia da classe TarefaService
    private final TarefaService tarefaService;

    // Construtor da TarefaController
    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    // Endpoint GET
    @GetMapping("/tarefas")
    // ResponseEntity = classe que permite manipular o status code do retorno do endpoint  e devolve um response mais completo
    // buscarTodasTarefas = método que chama a service
    public ResponseEntity<List<TarefaEntity>> buscarTodasTarefas() {
        return ResponseEntity.ok(tarefaService.buscarTarefas());
    }

    @GetMapping("/tarefa/{id}")
    public ResponseEntity<Optional<TarefaEntity>> buscarTarefaId(@PathVariable Long id) {
        return ResponseEntity.ok(tarefaService.buscarTarefaId(id));
    }

    @PostMapping("/tarefa")
    public ResponseEntity<TarefaEntity> criarTarefa(@RequestBody TarefaEntity tarefa) {
        TarefaEntity tarefaEntity = tarefaService.criarTarefa(tarefa);
        return ResponseEntity.created(null).body(tarefaEntity);
    }

}
