package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVINGTASK="DRIVINGTASK";
    public static final String PAINTINGTASK="PAINTINGTASK";
    public static final String SHOPPINGTASK="SHOPPINGTASK";

    public final Task makeTask(final String taskFactoryClass){
        switch (taskFactoryClass){
            case DRIVINGTASK:
                return new DrivingTask("Fast driving task 2020", "To Krakow", "Car");
            case PAINTINGTASK:
                return new PaintingTask ("Great painting task 2020", "Blue", "Whole flat");
            case SHOPPINGTASK:
                return new ShoppingTask ("Big shopping task 2020","Food &drinks", 100.0);
            default:
                return null;
        }
    }
}
