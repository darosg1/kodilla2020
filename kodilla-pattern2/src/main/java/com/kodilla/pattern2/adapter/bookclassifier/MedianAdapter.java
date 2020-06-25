package com.kodilla.pattern2.adapter.bookclassifier;

import com.kodilla.pattern2.adapter.bookclasifier.librarya.Book;
import com.kodilla.pattern2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.pattern2.adapter.bookclasifier.libraryb.BookSignature;
import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.pattern2.adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>();

        for (Book book:bookSet) {
            com.kodilla.pattern2.adapter.bookclasifier.libraryb.Book bookNew =
                    new com.kodilla.pattern2.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear());
            bookMap.put(new BookSignature(book.getSignature()), bookNew);
        }
        return medianPublicationYear(bookMap);
    }
}