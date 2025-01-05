package com.example.todo.Task.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class List extends BaseEntity {
    @ManyToOne
    private TaskItem taskItem;

    @ManyToOne
    private Brainstorm brainstorm;

    @ManyToOne
    private Note note;

    @ManyToOne
    private Draw draw;
}
