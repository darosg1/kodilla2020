package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory factory=new TaskFactory();
        //When
        Task drivingTask=factory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("Fast driving task 2020", drivingTask.getTaskName());
        Assert.assertTrue (drivingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryPaintingTas(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask=factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Great painting task 2020", paintingTask.getTaskName());
        Assert.assertTrue (paintingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask=factory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("Big shopping task 2020", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
}
