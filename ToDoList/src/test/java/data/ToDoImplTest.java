package data;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ToDoImplTest {

    public ArrayList<ToDo> toDos = new ArrayList<>();

    public ToDoImplTest(){
        toDos.add(new ToDo(0, "Test 1"));
        toDos.add(new ToDo(1, "Test 2"));
        toDos.add(new ToDo(2, "Test 3"));
        toDos.add(new ToDo(3, "Test 4"));

    }


    @Test
    public void getAllToDos() {
        assertEquals(4, toDos.size());
    }

    @Test
    public void getToDoById() {
        assertEquals("Test 1",toDos.get(0).getValue());
        assertEquals("Test 3",toDos.get(2).getValue());
    }

    @Test
    public void saveToDos() {
        toDos.add(new ToDo(4, "Test 5"));
        assertEquals("Test 5",toDos.get(4).getValue());
    }

    @Test
    public void deletToDos() {
        toDos.remove(new ToDo(4, "Test 5"));
        assertEquals(4 ,toDos.size());
    }
}