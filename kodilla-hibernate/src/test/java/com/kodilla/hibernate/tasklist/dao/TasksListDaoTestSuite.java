package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TasksList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TasksListDaoTestSuite {
    @Autowired
    private TasksListDao tasksListDao;
    private static final String LISTNAME = "List name";
    private static final String DESCRIPTION = "List with task";

    @Test
    public void testFindByListName() {

        //Given
        TasksList taskList = new TasksList(LISTNAME,DESCRIPTION);
        tasksListDao.save(taskList);
        String nameList = taskList.getListName();

        //When
        List<TasksList> readTaskList = tasksListDao.findByListName(nameList);
        int id = taskList.getId();

        //Then
        Assert.assertEquals(1,readTaskList.size());

        //cleanUp
        tasksListDao.deleteById(id);
    }
}
