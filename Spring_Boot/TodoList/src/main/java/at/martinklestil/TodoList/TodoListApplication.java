package at.martinklestil.TodoList;

import at.martinklestil.TodoList.model.Todo;
import at.martinklestil.TodoList.service.TodoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TodoListApplication.class, args);

		// Zugriff auf den TodoService
		TodoService todoService = context.getBean(TodoService.class);

		// Erstellen von Testdaten
		Todo todo1 = new Todo(1, "Einkaufen", false);
		Todo todo2 = new Todo(2, "Wäsche waschen", false);

		// Hinzufügen von Testdaten zur Todo-Liste
		todoService.addTodo(todo1);
		todoService.addTodo(todo2);
	}

}
