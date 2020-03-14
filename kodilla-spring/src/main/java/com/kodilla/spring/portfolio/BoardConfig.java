package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Qualifier("inProgressList")
    TaskList taskList;

    @Bean
    public Board getBoard() {
        return new Board(taskList);
    }

    @Bean
    @Scope("prototype")
    public TaskList getTaskList() {
        return new TaskList(new ArrayList<>());
    }
}
