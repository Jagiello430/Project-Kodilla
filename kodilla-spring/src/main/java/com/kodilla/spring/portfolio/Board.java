package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList taskList) {
        this.toDoList = new TaskList(taskList);
        this.inProgressList = new TaskList(taskList);
        this.doneList = new TaskList(taskList);
    }

    List<String> addTask(TaskList taskList,String task) {
        taskList.add(task);
        return new ArrayList<>((Collection<? extends String>) taskList);
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
