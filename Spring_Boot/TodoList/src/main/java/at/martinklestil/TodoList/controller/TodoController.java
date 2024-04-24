package at.martinklestil.TodoList.controller;


import at.martinklestil.TodoList.model.Todo;
import at.martinklestil.TodoList.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/todo")
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }


}
