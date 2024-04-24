package at.martinklestil.TodoList.model;

public class Todo {

    private int id;
    private String todo;
    private boolean completed = false;


    public Todo() {
    }

    public Todo(Integer id, String todo, Boolean completed) {
        this.id = id;
        this.todo = todo;
        this.completed = completed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", todo='" + todo + '\'' +
                ", completed=" + completed +
                '}';
    }
}
