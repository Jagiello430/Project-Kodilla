package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public boolean executeTask() {
        System.out.println("You have to buy " + whatToBuy + " and pay " + quantity);
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
