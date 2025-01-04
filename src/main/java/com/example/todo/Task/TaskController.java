package com.example.todo.Task;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tasks")
public class TaskController {

    @Autowired
    private TaskRepository repository;


    @PostMapping("/add")
    public TaskItem addTask(@Valid @RequestBody TaskItem taskItem) {
        return repository.save(taskItem);
    }
}
