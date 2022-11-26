package com.example.demo.ToDoList;

import java.util.Comparator;

public class DescriptionComparator implements Comparator<ToDoList> {

    @Override
    public int compare(ToDoList o1, ToDoList o2){
        return o1.getDescription().compareTo(o2.getDescription());
    }

}
