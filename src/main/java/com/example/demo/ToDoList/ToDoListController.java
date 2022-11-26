package com.example.demo.ToDoList;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping(path = "api/v1")
@RestController
public class ToDoListController {

    private final ToDoListService toDoListService;

    public ToDoListController(ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    @GetMapping(path = "get/toDoLists")
    List<ToDoList> getToDoLists() {
        return toDoListService.getToDoLists();
    }
    @GetMapping(path = "get/toDoList/{toDoListId}")
    ToDoList getToDoLists(@PathVariable("toDoListId") Integer id) {
        return toDoListService.getToDoList(id);
    }

    @GetMapping(path = "get/toDoLists/{sortBy}")
    List<ToDoList> getSortedToDoLists(@PathVariable("sortBy") String sortBy) {
        return toDoListService.getSortedToDoLists(sortBy);
    }

    @GetMapping(path = "get/toDoLists/{filterBy}/{target}")
    List<ToDoList> getFilterToDoLists(@PathVariable("filterBy") String filterBy, @PathVariable("target") String target) {
        return toDoListService.getFilteredToDoLists(filterBy, target);
    }

    @PostMapping(path = "create")
    void createNewToDoList(@Valid @RequestBody ToDoList toDoList){
        toDoListService.createNewToDoList(toDoList);
    }

    @PutMapping(path = "update/{toDoListId}")
    void updateToDoList(@RequestBody ToDoList toDoList, @PathVariable("toDoListId") Integer id){
        System.out.println("Updating ToDoList with Id " + id);
        toDoListService.updateToDoList(id, toDoList);
    }

    @DeleteMapping(path = "delete/{toDoListId}")
    void deleteToDoList(@PathVariable("toDoListId") Integer id){
        System.out.println("Deleting ToDoList with Id " + id);
        toDoListService.deleteToDoList(id);
    }
}
