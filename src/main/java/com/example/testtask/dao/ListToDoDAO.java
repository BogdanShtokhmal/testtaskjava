package com.example.testtask.dao;

import com.example.testtask.models.ListToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ListToDoDAO extends JpaRepository<ListToDo, Integer> {

}
