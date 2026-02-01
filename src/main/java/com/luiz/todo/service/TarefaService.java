package com.luiz.todo.service;


import com.luiz.todo.entity.TarefaEntity;
import org.springframework.stereotype.Service;
import com.luiz.todo.repository.TarefaRepository;

import java.util.List;

@Service
public class TarefaService {
    // tarefaRepository = instancia da classe TarefaRepository
    private final TarefaRepository tarefaRepository;

    // Construtor da TarefaService
    public TarefaService(TarefaRepository tarefaRepository) {
        // Injetando a TarefaRepository na TarefaService
        this.tarefaRepository = tarefaRepository;
    }

    // buscarTarefas = Método que chama o repository para buscar as tarefas
    public List<TarefaEntity> buscarTarefas() {
        return tarefaRepository.findAll();
    }
}
