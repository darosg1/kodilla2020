package com.kodilla.pattern2.observer.homework;


public class Mentor implements Observer{
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }
    @Override
    public void update(Student student){
        System.out.println(mentorName + ": received new task " + student.getTasks().getLast()+
                " from " + student.getName() + ". Total number of tasks in queue "+student.getTasks().size());
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

}
