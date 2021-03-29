package com.example.testtask.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"listToDo"})
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String body;
    private String finaldata;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private ListToDo listToDo;

    public Todo(String title) {
        this.title = title;
    }

    

    public Todo(String title, String body, String finaldata) {
        this.title = title;
        this.body = body;
        this.finaldata = finaldata;
    }

    public Todo(String title, ListToDo listToDo) {
        this.title = title;
        this.listToDo = listToDo;
    }


}
