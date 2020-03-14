package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void showListTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Board board = context.getBean(Board.class);

        board.getDoneList();
        board.getInProgressList();
        board.getToDoList();
        board.showList(board.getToDoList());
    }
}
