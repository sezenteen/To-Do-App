package com.example.todo.Task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    private String todoPage() {
        return "todo";
    }

    @GetMapping("/list")
    private String listPage() {
        return "list";
    }

    @GetMapping("/brainstorm")
    private String brainstormPage() {
        return "brainstorm";
    }

    @GetMapping("/note")
    private String notesPage() {
        return "note";
    }

    @GetMapping("/draw")
    private String drawingPage() {
        return "draw";
    }
}
