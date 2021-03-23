package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Task;
import com.repository.TaskRepository;

@RestController
public class TaskController {
	@Autowired

	private TaskRepository taskRepository;

	@GetMapping
	public List<Task> index() {
		return (List<Task>) taskRepository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Task> getTask(@PathVariable("id") Integer id) {
		return taskRepository.findById(id);
	}

	@PostMapping
	public Task add(@RequestBody Task task) {
		return taskRepository.save(task);
	}

	@PutMapping("/{id}")
	public Task update(@PathVariable("id") int id, @RequestBody Task taskUpdate) {
		Task task = taskRepository.findById(id).orElseThrow();

		task.setTitulo((taskUpdate.getTitulo() != null) ? taskUpdate.getTitulo() : task.getTitulo());
		task.setDetalhe((taskUpdate.getDetalhe() != null) ? taskUpdate.getDetalhe() : task.getDetalhe());

		return taskRepository.save(task);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
		taskRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
