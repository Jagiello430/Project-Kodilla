
package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TasksList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
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
        Assert.assertEquals(8,readTaskList.size());

        //cleanUp
        tasksListDao.deleteById(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task1 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task1.setTaskFinancialDetails(tfd1);
        TasksList taskList = new TasksList(LISTNAME,"ToDo Tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task1);
        task.setTaskList(taskList);
        task1.setTaskList(taskList);

        //When
        tasksListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assert.assertNotEquals(0,id);

        //CleanUp
        tasksListDao.deleteById(id);
    }
}