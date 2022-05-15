package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean isExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        if (!isExecuted) {
            isExecuted = true;
            return "Going to: " + where + " by " + using;
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
        if (where.length() < 10) {
            return isExecuted = true;
        } else {
            return isExecuted = false;
        }
    }
}
