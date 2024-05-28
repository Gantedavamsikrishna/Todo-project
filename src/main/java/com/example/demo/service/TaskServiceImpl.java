package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Todo;
import com.example.demo.repo.TodoRepository;



@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	private TodoRepository todorepository;
	
	public TaskServiceImpl(TodoRepository TodoRepository) {
        this.todorepository = TodoRepository;
    }

	@Override
	public List<Todo> getAllTasks() {
		
		return todorepository.findAll() ;
	}

	@Override
	public Todo getTaskById(Long id) {
		return todorepository.findById(id).orElse(null) ;
	}

	@Override
	public Todo saveTask(Todo todo) {
		return todorepository.save(todo);
		
	}

	@Override
	public Todo updateTask(Long id, Todo todo) {
		return todorepository.save(todo);
	}

	@Override
	public void deleteTask(Long id) {
		todorepository.deleteById(id);;		
	}
}
   
