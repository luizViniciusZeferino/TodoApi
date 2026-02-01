package com.luiz.todo.repository;

import com.luiz.todo.entity.TarefaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaEntity, Long> { // Repositorio gerencia entidade TarefaEntity que tem id tipo Long


}