package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task{
    String taskName;
    String where;
    String using;
    boolean isTaskExecuted=false;

    public DrivingTask(String taskName , String where , String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
    @Override
    public void executeTask(){
        isTaskExecuted=true;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
