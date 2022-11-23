package com.example.demo.ToDoList;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ToDoListRepository extends JpaRepository<ToDoList, String> {
}
