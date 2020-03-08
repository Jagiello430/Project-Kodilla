package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList(TaskList tasks) {
        this.tasks = new ArrayList<>((Collection<? extends String>) tasks);
    }

    public List<String> add(String task) {
        tasks.add(task);
        return tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }
}

