package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case PAINTING:
                return new PaintingTask("Painting", "Green", "Forest");
            case DRIVING:
                return new DrivingTask("Logistic driving", "Katowice", "Mercedes");
            case SHOPPING:
                return new ShoppingTask("Shopping at Auchan", "Pierogi", 10.0);
            default:
                return null;
        }
    }

}
