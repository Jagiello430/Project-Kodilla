package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Qualifier("inProgressList")
    TaskList taskList;

    @Bean
    public Board getBoard() {
        return new Board(taskList);
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getListToDo() {
        return new TaskList(getListToDo().getTasks());
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getListInProgress() {
        return new TaskList(getListInProgress().getTasks());
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getListDone() {
        return new TaskList(getListDone().getTasks());
    }
}
