package com.example.demo.ToDoList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoListService {

    private final ToDoListRepository toDoListRepository;

    @Autowired
    public ToDoListService(ToDoListRepository toDoListRepository){
        this.toDoListRepository = toDoListRepository;
    }

    List<ToDoList> getToDoLists(){
        return toDoListRepository.findAll();
    }

    List<ToDoList> getFilteredToDoLists(String filterBy, String target){
        if (filterBy.equals("status"))
            return getToDoLists().stream()
                    .filter(toDoList -> toDoList.getStatus().equals(target))
                    .collect(Collectors.toList());
        else if (filterBy.equals("date"))
            return getToDoLists().stream()
                    .filter(toDoList -> target.compareTo(toDoList.getDueDate()) > 0)
                    .collect(Collectors.toList());
        return null;
    }
    List<ToDoList> getSortedToDoLists(String sortBy){
        Comparator<ToDoList> comparator = new IdComparator();
        if (sortBy.equals("name")){
            comparator = new NameComparator();
        }
        else if (sortBy.equals("description")){
            comparator = new DescriptionComparator();
        }
        else if (sortBy.equals("date")){
            comparator = new DateComparator();
        }
        else if (sortBy.equals("status")){
            comparator = new StatusComparator();
        }
        List<ToDoList> toDoLists = getToDoLists();
        Collections.sort(toDoLists, comparator);
        return toDoLists;
    }

    ToDoList getToDoList(Integer id){
        return toDoListRepository
                .findById(id)
                .orElseThrow(()-> new IllegalStateException("toDoList with Id "+ id+" not found"));
    }

    void createNewToDoList(ToDoList toDoList){
        toDoListRepository.save(toDoList);
    }

    void updateToDoList(Integer id, ToDoList toDoList){
        ToDoList targetedToDoList = getToDoList(id);
        targetedToDoList.setName(toDoList.getName());
        targetedToDoList.setDescription(toDoList.getDescription());
        targetedToDoList.setDueDate(toDoList.getDueDate());
        targetedToDoList.setStatus(toDoList.getStatus());
        toDoListRepository.save(targetedToDoList);
    }

    void deleteToDoList(Integer id){
        getToDoList(id);
        toDoListRepository
                .deleteById(id);
    }
}
