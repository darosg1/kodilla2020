package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class BoardTestSuite {
    @Test
    public void testTaskBeanExist(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        //When
        boolean boardExists = context.containsBean("getBoard");
        boolean taskToDoListExists = context.containsBean("taskToDoList");
        boolean taskInProgressListExists = context.containsBean("taskInProgressList");
        boolean taskDoneListExists = context.containsBean("taskDoneList");
        //Then
        System.out.println("Bean getBoard został znaleziony w kontenerze: " + boardExists);
        System.out.println("Bean taskToDoList został znaleziony w kontenerze: " + taskToDoListExists);
        System.out.println("Bean taskInProgressList został znaleziony w kontenerze: " + taskInProgressListExists);
        System.out.println("Bean taskDoneList został znaleziony w kontenerze: " + taskDoneListExists);

        Assert.assertTrue(boardExists);
        Assert.assertTrue(taskToDoListExists);
        Assert.assertTrue(taskInProgressListExists);
        Assert.assertTrue(taskDoneListExists);
    }
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("Task to do list");
        board.getInProgressList().addTask("Task in progress list");
        board.getDoneList().addTask("Task done list");
        //Then
        Assert.assertEquals("Task to do list", board.getToDoList().getTask(0));
        Assert.assertEquals("Task in progress list", board.getInProgressList().getTask(0));
        Assert.assertEquals("Task done list", board.getDoneList().getTask(0));
    }
}
