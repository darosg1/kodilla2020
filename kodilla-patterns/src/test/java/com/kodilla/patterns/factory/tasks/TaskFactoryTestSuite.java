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
        //Then
        Assert.assertEquals("Fast driving task 2020", drivingTask.getTaskName());
        Assert.assertTrue ( true);
    }
    @Test
    public void testFactoryPaintingTas(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask=factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Great painting task 2020", paintingTask.getTaskName());
        Assert.assertTrue (true);
    }
    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask=factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Big shopping task 2020", shoppingTask.getTaskName());
        Assert.assertTrue(true);
    }
}
