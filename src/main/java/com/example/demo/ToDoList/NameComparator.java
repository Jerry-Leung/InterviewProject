package com.example.demo.ToDoList;

import java.util.Comparator;

public class NameComparator implements Comparator<ToDoList> {

    @Override
    public int compare(ToDoList o1, ToDoList o2){
        return o1.getName().compareTo(o2.getName());
    }

}