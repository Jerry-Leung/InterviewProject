package com.example.demo.ToDoList;

import java.util.Comparator;

public class IdComparator implements Comparator<ToDoList> {

    @Override
    public int compare(ToDoList o1, ToDoList o2){
        return o1.getId().compareTo(o2.getId());
    }

}
