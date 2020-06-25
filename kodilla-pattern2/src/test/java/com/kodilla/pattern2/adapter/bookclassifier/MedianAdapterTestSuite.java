package com.kodilla.pattern2.adapter.bookclassifier;

import com.kodilla.pattern2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Book book1 = new Book("Arthur Conan Doyle", "Adventures of Sherlock Holmes", 1990, "123A");
        Book book2 = new Book("Zbigniew Nienacki", "Pan Samochodzik i Wyspa Złoczyńców", 2008, "124A");
        Book book3 = new Book("Zbigniew Nienacki", "Pan Samochodzik i człowiek z UFO", 2018, "124B");
        Book book4 = new Book("Zbigniew Nienacki", "Pan Samochodzik i Fantomas", 2010, "124C");
        Book book5 = new Book("Zbigniew Nienacki", "Pan Samochodzik i tajemnica tajemic", 2006, "124D");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int result = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(result);
        Assert.assertEquals(2008, result);
    }
}
