package com.example.demo.ToDoList;

import java.util.Comparator;

public class DateComparator implements Comparator<ToDoList> {

    @Override
    public int compare(ToDoList o1, ToDoList o2){
        return o1.getDueDate().compareTo(o2.getDueDate());
    }

}
