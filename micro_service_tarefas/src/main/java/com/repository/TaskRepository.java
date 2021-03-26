package com.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
