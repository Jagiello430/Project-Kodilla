package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    private boolean isExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public boolean executeTask() {
        System.out.println("you have to go to " + where + " and using " + using);
        return isExecuted = true;
    }

    @Override
    public void getTaskName() {
        System.out.print(taskName + ": ");
    }

    @Override
    public boolean isTaskExecuted() {
        if (isExecuted){
            System.out.println("done");
            return true;
        } else {
            System.out.println("not done");
            return false;
        }
    }
}
