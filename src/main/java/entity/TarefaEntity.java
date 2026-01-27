package entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tarefa")

public class TarefaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera id automaticamente
    @Column(name = "tarefa_id")
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;
}
