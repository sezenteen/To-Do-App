package com.example.todo.Task.model;

import jakarta.persistence.Entity;

@Entity
public class Brainstorm extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
