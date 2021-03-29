package com.example.testtask.controllers;

import com.example.testtask.dao.ListToDoDAO;
import com.example.testtask.dao.ToDoDAO;
import com.example.testtask.models.ListToDo;
import com.example.testtask.models.Todo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/listtodos")
@CrossOrigin(origins = "http://localhost:4200")

public class ListToDoController {
    private ListToDoDAO listToDoDAO;
    private ToDoDAO toDoDAO;



    @GetMapping()
    public List<ListToDo> getListToDos(){
        return listToDoDAO.findAll();
    }

    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return toDoDAO.findAll();
    }



    @GetMapping("/{id}")
    public ListToDo getListToDo(@PathVariable int id){
        ListToDo one = listToDoDAO.getOne(id);
        return one;
    }

    @PostMapping("/save")
    public void save(@RequestBody ListToDo listToDo){
        listToDoDAO.save(listToDo);
    }


    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable int id) {
       listToDoDAO.deleteById(id);
    }






}
