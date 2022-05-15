package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        if (!isExecuted) {
            isExecuted = true;
            return "Going to buy: " + whatToBuy + " in quantity of: " + quantity;

        } else {
            return  "Task has been finished";
        }

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        if (quantity >= 7) {
            return isExecuted = true;
        } else {
            return  isExecuted = false;
        }
    }
}
