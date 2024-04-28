package at.martinklestil.TodoList.service;


import at.martinklestil.TodoList.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    /*Create a service class responsible for managing the todo list.
    This class should contain methods for adding, editing, deleting and retrieving Todo objects.
     */

    private List<Todo> todoList = new ArrayList<>();

    public List<Todo> getAllTodos(){
        return todoList;
    }

    public Todo addTodo(Todo todo){
        todoList.add(todo);
        return todo;
    }

    public void removeTodo(int index) {
        todoList.remove(index);
    }

    public void editTodo(int index, Todo todo){
        todoList.remove(index);
        todoList.add(index, todo);
    }

    public Todo retrievingTodo(int index){
        return todoList.get(index);
    }

}
