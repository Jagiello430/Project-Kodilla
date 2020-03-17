package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("you have to go to " + where + " and " + using);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        System.out.println("done");
        return true;
    }
}
