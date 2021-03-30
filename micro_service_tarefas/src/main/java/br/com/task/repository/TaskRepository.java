package br.com.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.task.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
