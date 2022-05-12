package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBook() throws CloneNotSupportedException {
        //Given
        Book book1 = new Book("Harry Potter", "J.K", LocalDate.of(1999, 5, 2));
        Book book2 = new Book("Harry ", "J.K", LocalDate.of(1997, 5, 2));
        Book book3 = new Book("Potter", "J.K", LocalDate.of(1998, 5, 2));
        Book book4 = new Book("HP", "J.K", LocalDate.of(1990, 5, 2));

        Library library = new Library("Library of books");
        Set<Book> bookSet = library.getBooks();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);

        System.out.println(bookSet);

        //Shallow clone
        System.out.println();

        Library shallowClone = library.shallowClone();
        Set<Book> shallowCloneSet = shallowClone.getBooks();
        shallowCloneSet.remove(book1);
        System.out.println(shallowCloneSet);

        //DeepClone
        System.out.println();

        Library deepClone = library.deepClone();
        Set<Book> deepCloneSet = deepClone.getBooks();
        deepCloneSet.remove(book2);
        deepCloneSet.remove(book1);
        System.out.println(deepCloneSet);

        assertEquals(4, library.getBooks().size());
        assertEquals(4, shallowClone.getBooks().size());
        assertEquals(2, deepClone.getBooks().size());
    }
}
