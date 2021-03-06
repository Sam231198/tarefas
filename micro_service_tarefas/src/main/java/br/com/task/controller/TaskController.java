package br.com.task.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.task.model.Task;
import br.com.task.repository.TaskRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="http://localhost:8081", maxAge=3600)
@RestController
@Api(value = "API Rest Tarefas")
public class TaskController {

	@Autowired
	private TaskRepository taskRepository;

	@GetMapping("/get")
	@ApiOperation(value = "Retorna uma lista de tarefas")
	public List<Task> index() {
		return this.taskRepository.findAll();
	}

	@GetMapping("/get/{id}")
	@ApiOperation(value = "Retorna uma tarefa")
	public Optional<Task> getTask(@PathVariable("id") Integer id) {
		return this.taskRepository.findById(id);
	}

	@PostMapping("/save")
	@ApiOperation(value = "Salva uma tarefa")
	public Task add(@RequestBody Task newTask) {
		return this.taskRepository.save(newTask);
	}

	@PutMapping("/update/{id}")
	@ApiOperation(value = "Atualiza uma tarefa")
	public Task update(@PathVariable("id") Integer id, @RequestBody Task taskUpdate) {
		Task task = this.taskRepository.findById(id).orElseThrow();

		task.setTitulo((taskUpdate.getTitulo() != null) ? taskUpdate.getTitulo() : task.getTitulo());
		task.setDetalhe((taskUpdate.getDetalhe() != null) ? taskUpdate.getDetalhe() : task.getDetalhe());

		return this.taskRepository.save(task);
	}

	@DeleteMapping("/delete/{id}")
	@ApiOperation(value = "Deleta um tarefa")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
		this.taskRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
