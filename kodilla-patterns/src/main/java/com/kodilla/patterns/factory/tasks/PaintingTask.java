package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public boolean executeTask() {
        System.out.println("you have to paint " + whatToPaint + " on the " + color );
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
