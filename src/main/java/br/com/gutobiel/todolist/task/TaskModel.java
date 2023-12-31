package br.com.gutobiel.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;



@Data
@Entity(name = "tb_tasks")
public class TaskModel {
    /* 
     * 
     * ID
     * Usuário (ID_USUÁRIO)
     * Descrição
     * Título
     * Data Inicio e data término
     * Prioridade
     * 
     */
    @Id
    @GeneratedValue(generator = "UUID")
     private UUID id;
     private String description;

     @Column(length = 50)
     private String title;
     private LocalDateTime startAt;
     private LocalDateTime endAt;
     private String priority;

     private LocalDateTime createAt;

     private UUID idUser;
}
