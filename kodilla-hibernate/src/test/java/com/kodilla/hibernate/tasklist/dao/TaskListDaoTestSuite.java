package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test - Exercise Hibernate";
    private static final String LISTNAME = "Test - List";

    @Test
    public void testTaskListDao() {
        //Given
        TaskList taskList = new TaskList (LISTNAME, DESCRIPTION);
        //When
        taskListDao.save (taskList);
        //Then
        int id = taskList.getId();
        Optional<TaskList> readTaskList = taskListDao.findById(id);
        Assert.assertTrue(readTaskList.isPresent());
        //CleanUp
        taskListDao.deleteById(id);
    }
    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList (LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readListName = taskListDao.findByListName(listName);
        //Then
        Assert.assertEquals(1, readListName.size());
        //CleanUp
        int id = readListName.get(0).getId();
        taskListDao.deleteById (id);
    }
}
