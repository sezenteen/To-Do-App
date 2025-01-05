package com.example.todo.Task.controller;

import com.example.todo.Task.repository.TaskRepository;
import com.example.todo.Task.model.TaskItem;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/tasks")
public class TaskController {

    @Autowired
    private TaskRepository repository;

    @PostMapping("/add")
    public TaskItem addTask(@Valid @RequestBody TaskItem taskItem) {
        return repository.save(taskItem);
    }

    @GetMapping
    public List<TaskItem> getTasks() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
