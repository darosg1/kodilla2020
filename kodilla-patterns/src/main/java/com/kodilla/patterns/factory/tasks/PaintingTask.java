package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{
    String taskName;
    String color;
    String whatToPaint;
    boolean taskExecuted=false;

    public PaintingTask(String taskName , String color , String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public String getTaskName(){
        return taskName;
    }

    public String getColor(){
        return color;
    }

    public String getWhatToPaint(){
        return whatToPaint;
    }

    @Override
    public void executeTask(){
        taskExecuted=true;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
