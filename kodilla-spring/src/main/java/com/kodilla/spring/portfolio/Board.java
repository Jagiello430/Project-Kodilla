package com.kodilla.spring.portfolio;

public class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList taskList) {
        this.toDoList = taskList;
        this.inProgressList = taskList;
        this.doneList = taskList;
    }
    public void showList(TaskList taskList) {
        System.out.println("List: " + taskList);
    }

    public TaskList getToDoList() {
        return toDoList ;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
