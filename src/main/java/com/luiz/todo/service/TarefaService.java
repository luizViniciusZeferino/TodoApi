package com.luiz.todo.service;


import com.luiz.todo.entity.TarefaEntity;
import org.springframework.stereotype.Service;
import com.luiz.todo.repository.TarefaRepository;

import java.util.List;
import java.util.Optional;

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

    // optional por conta do retorno findById
    public Optional<TarefaEntity> buscarTarefaId(Long id){
        return tarefaRepository.findById(id);
    }

    public TarefaEntity criarTarefa(TarefaEntity tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public void deletarTarefaId(Long id) {
        tarefaRepository.deleteById(id);
        Optional<TarefaEntity> tarefa = buscarTarefaId(id);
        if (tarefa.isEmpty()) {
            System.out.println("Tarefa apagada!");
        } else {
            System.out.println("Tarefa não foi excluída");
        }
    }





}
