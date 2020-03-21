package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Book book1 = new Book("Adventure of Huckleberry Finn","Mark Twain", LocalDate.of (1884, 12, 12));
        Book book2 = new Book("The Adventures of Sherlock Holmes", "Arthur Conan Doyle", LocalDate.of ( 1892, 10, 14 ));
        Book book3 = new Book("The Bladerunner","Alan E.Nourse", LocalDate.of (1986, 12, 12));

        Library library = new Library ("Darek's library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        //shallow clone
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Darek's library 2");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //deep clone
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Darek's library 3");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book1);
        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        System.out.println(library.getName()+library.getBooks());
        System.out.println(clonedLibrary.getName()+clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getName()+deepClonedLibrary.getBooks());
    }
}
