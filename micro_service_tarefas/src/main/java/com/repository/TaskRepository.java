package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
