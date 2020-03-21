package com.kodilla.patterns.factory.tasks;

import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        shoppingTask.getTaskName();
        shoppingTask.executeTask();
        shoppingTask.isTaskExecuted();
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        paintingTask.getTaskName();
        paintingTask.isTaskExecuted();
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        drivingTask.getTaskName();
        drivingTask.executeTask();
        drivingTask.isTaskExecuted();
    }
}
