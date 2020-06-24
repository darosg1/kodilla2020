package com.kodilla.pattern2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Student implements Observable{
    private final String name;
    private final Deque<String> tasks = new ArrayDeque<>();
    private final List<Observer> observers = new ArrayList<>();

    public Student(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer mentor:observers){
            mentor.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void addTask(String task){
        tasks.offer(task);
        notifyObservers();
    }
}
