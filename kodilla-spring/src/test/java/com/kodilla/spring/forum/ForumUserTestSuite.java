package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {

    @Test
    public void testGetUsername() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        ForumUser forumUser = context.getBean(ForumUser.class);

        String name = forumUser.getUserName();

        Assert.assertEquals(name, "John Smith");
    }
}
