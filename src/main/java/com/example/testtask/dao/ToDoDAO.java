package com.example.testtask.dao;

import com.example.testtask.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ToDoDAO extends JpaRepository<Todo, Integer> {
}
