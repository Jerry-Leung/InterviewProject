package com.example.demo.ToDoList;

import java.util.Comparator;

public class StatusComparator implements Comparator<ToDoList> {

    @Override
    public int compare(ToDoList o1, ToDoList o2){
        return o1.getStatus().compareTo(o2.getStatus());
    }

}
