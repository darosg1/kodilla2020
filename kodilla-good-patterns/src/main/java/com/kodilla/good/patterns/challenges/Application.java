package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String booksList = movieStore.getMovies().entrySet().stream()
                    .flatMap (m->m.getValue().stream())
                    .collect(Collectors.joining("!"));
        System.out.println(booksList);
        }
}

