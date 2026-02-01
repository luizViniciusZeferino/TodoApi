package com.luiz.todo.controller;
import com.luiz.todo.entity.TarefaEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.luiz.todo.service.TarefaService;

import java.util.List;

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
}
