package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "List name";
    private static final String DESCRIPTION = "List with task";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);
        taskListDao.save(taskList);
        String nameList = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(nameList);
        int id = taskList.getId();

        //Then
        Assert.assertEquals(1,readTaskList.size());

        //cleanUp
        taskListDao.deleteById(id);
    }
}
