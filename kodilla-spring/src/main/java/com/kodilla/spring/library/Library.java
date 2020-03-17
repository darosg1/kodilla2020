package com.kodilla.spring.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<String> books = new ArrayList<>();
    private LibraryDbController libraryDbController;

    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }
    //drugi konstruktor
    public Library(){

    }

    public void saveToDb(){
        libraryDbController.safeDate();
    }

    public void loadFromDb(){
        libraryDbController.loadData();
    }
}
