package data;

import java.util.ArrayList;

public class ToDoImpl implements ToDoDao{
	
	private final ArrayList<ToDo> toDos;
	
	public ToDoImpl() {
		toDos = new ArrayList<>();
	}

	@Override
	public ArrayList<ToDo> getAllToDos() {
		return toDos;
	}

	@Override
	public ToDo getToDoById(int id) {
		return toDos.get(id);
	}

	@Override
	public void saveToDos(ToDo todo) {
		toDos.add(todo);
		System.out.println("Save " + todo);
		
	}

	@Override
	public void deletToDos(ToDo todo) {
		System.out.println("Delet Function " + todo);
		toDos.remove(todo);		
	}

}
