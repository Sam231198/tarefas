package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiImplicitParam;

import com.model.Task;
import com.repository.TaskRepository;

@RestController
@Api(value = "API Rest Tarefas")
@CrossOrigin(origins = "8")
public class TaskController {

	@Autowired
	private TaskRepository taskRepository;

	@GetMapping
	@ApiOperation(value = "Retorna uma lista de tarefas")
	public List<Task> index() {
		return this.taskRepository.findAll();
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Retorna uma tarefa")
	@ApiImplicitParam(name="id", value="id da tarefa", required =
			true, dataType = "Map", paramType = "query")
	public Optional<Task> getTask(@PathVariable("id") Integer id) {
		return this.taskRepository.findById(id);
	}

	@PostMapping
	@ApiOperation(value = "Salva uma tarefa")
	public Task add(@RequestBody Task task) {
		return this.taskRepository.save(task);
	}

	@PutMapping("/{id}")
	@ApiOperation(value = "Atualiza uma tarefa")
	@ApiImplicitParam(name="id", value="id da tarefa", required =
			true, dataType = "Map", paramType = "query")
	public Task update(@PathVariable("id") int id, @RequestBody Task taskUpdate) {
		Task task = this.taskRepository.findById(id).orElseThrow();

		task.setTitulo((taskUpdate.getTitulo() != null) ? taskUpdate.getTitulo() : task.getTitulo());
		task.setDetalhe((taskUpdate.getDetalhe() != null) ? taskUpdate.getDetalhe() : task.getDetalhe());

		return this.taskRepository.save(task);
	}

	@DeleteMapping("/{id}")
	@ApiOperation(value = "Deleta um tarefa")
	@ApiImplicitParam(name="id", value="id da tarefa", required =
			true, dataType = "Map", paramType = "query")
	public ResponseEntity<?> delete(@PathVariable("id") int id) {
		this.taskRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
