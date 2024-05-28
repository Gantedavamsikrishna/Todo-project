package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Todo;

public interface TaskService {
    List<Todo> getAllTasks();
    Todo getTaskById(Long id);
    Todo saveTask(Todo todo);
    Todo updateTask(Long id, Todo todo);
    void deleteTask(Long id);
}
