package com.example.week5codechallenges.todolist;

public class ToDoItem {
    private String mTaskToDo;

    public ToDoItem(String taskToDo) {
        mTaskToDo = taskToDo;
    }

    public String getTaskToDo() {
        return mTaskToDo;
    }

    public void setTaskToDo(String taskToDo) {
        mTaskToDo = taskToDo;
    }
}
