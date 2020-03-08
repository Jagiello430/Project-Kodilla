package com.kodilla.spring.portfolio;

import org.junit.Assert;
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
    public void addTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        Board board = context.getBean(Board.class);

        board.addTask(board.getToDoList(),"Task");

        Assert.assertEquals(board.getToDoList().getTasks().size(), 1);
    }
}
