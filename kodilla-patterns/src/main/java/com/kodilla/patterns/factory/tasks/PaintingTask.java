package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        if (!isExecuted) {
            isExecuted = true;
            return "Painting: " + whatToPaint + ", using only " + color + " color";
        } else {
         return "Task has been finished";
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        if (color.startsWith("P") || color.startsWith("B") || color.startsWith("R")) {
            return isExecuted = false;
        } else {
            return isExecuted = true;
        }
    }
}
