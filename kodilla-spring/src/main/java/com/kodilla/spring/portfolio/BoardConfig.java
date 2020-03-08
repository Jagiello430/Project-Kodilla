package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    Board board;

    @Bean(name = "toDoList")
    @Scope("prototype")
    public Board getListToDo() {
        return new Board(board.getToDoList());
    }
    @Bean(name = "inProgressList")
    @Scope("prototype")
    public Board getListInProgress() {
        return new Board(board.getInProgressList());
    }
    @Bean(name = "doneList")
    @Scope("prototype")
    public Board getListDone() {
        return new Board(board.getDoneList());
    }
}
