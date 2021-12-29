package data;

import java.util.ArrayList;

public interface ToDoDao {
	//DAO Pattern Interface
	ArrayList<ToDo> getAllToDos();
	ToDo getToDoById (int id);
	void saveToDos (ToDo todo);
	void deletToDos (ToDo todo);
	

}
