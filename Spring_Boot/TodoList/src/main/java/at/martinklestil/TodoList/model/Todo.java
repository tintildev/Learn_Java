package at.martinklestil.TodoList.model;

public class Todo {


    private String todo;
    private boolean completed = false;

    private static int index = 0;


    public Todo() {
    }

    public Todo(String todo, boolean completed) {
        index =  getIndex() + 1;
        this.todo = todo;
        this.completed = completed;
    }

    public static int getIndex() {
        return index;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                ", todo='" + todo + '\'' +
                ", completed=" + completed +
                '}';
    }
}
