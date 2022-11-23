package com.example.demo.ToDoList;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoListService {

    private final ToDoListRepository toDoListRepository;

    public ToDoListService(ToDoListRepository toDoListRepository){
        this.toDoListRepository = toDoListRepository;
    }

    String getToDoLists(){
        return "response from service";
    }
}
