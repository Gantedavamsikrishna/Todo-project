package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Todo;
import com.example.demo.service.TaskService;



@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Todo> getAllTasks() {
        return taskService.getAllTasks();
        
    }

    @GetMapping("/task/{id}")
    public Todo getTaskById(@PathVariable("id") Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("/add")
    public Todo createTask(@RequestBody Todo todo) {
        return taskService.saveTask(todo);
    }

    @PutMapping("/update/{id}")
    public Todo updateTask(@PathVariable("id") Long id, @RequestBody Todo todo) {
        return taskService.updateTask(id, todo);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable("id") Long id) {
        taskService.deleteTask(id);
    }
}
