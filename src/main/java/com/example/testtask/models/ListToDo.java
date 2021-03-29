package com.example.testtask.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"todos"})
public class ListToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String title;
    private Date createdAT = new Date();
    private Date updatedAT = new Date();
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    @JoinColumn(name = "list_To_Do_id")

    private List<Todo> todos = new ArrayList<>();

    public ListToDo(String title) {
        this.title = title;
    }

    public ListToDo(String title, List<Todo> todos) {
        this.title = title;
        this.todos = todos;
    }

}
