package com.praktikum.bay.Bayu_1202154127_StudyCase5;

/**
 * Created by Bayu on 3/24/2018.
 */

public class Todo {
    //Mendeklarasikan nama variable
    String id;
    private String todo, description, priority;

    //Konstruktor dari class menu yang berisi parameter
    public Todo() {

    }
    //Setter dan getter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
