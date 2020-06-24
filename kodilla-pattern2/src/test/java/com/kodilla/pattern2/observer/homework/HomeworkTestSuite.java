package com.kodilla.pattern2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {

    @Test
    public void testUpdate(){
        //Given
        Student studentName = new Student("Darek");
        Student studentName2 = new Student("Marek");
        Student studentName3 = new Student("Arek");

        Mentor mentorMateusz = new Mentor("Mateusz");
        Mentor mentorRafal = new Mentor("Rafał");

        studentName.registerObserver(mentorMateusz);
        studentName2.registerObserver(mentorMateusz);
        studentName3.registerObserver(mentorRafal);
        //When
        studentName.addTask("Moduł 24 zadanie 4");
        studentName.addTask("Moduł 24 zadanie 5");
        studentName.addTask("Moduł 25 zadanie 1");
        studentName2.addTask("Moduł 1 zadanie 2");
        studentName2.addTask("Moduł 1 zadanie 3");
        studentName2.addTask("Moduł 2 zadanie 1");

        studentName3.addTask("Moduł 7 zadanie 1");
        studentName3.addTask("Moduł 7 zadanie 2");
        studentName3.addTask("Moduł 7 zadanie 3");
        studentName3.addTask("Moduł 7 zadanie 4");
        //Then
        Assert.assertEquals(6, mentorMateusz.getUpdateCount());
        Assert.assertEquals(4, mentorRafal.getUpdateCount());
    }
}
