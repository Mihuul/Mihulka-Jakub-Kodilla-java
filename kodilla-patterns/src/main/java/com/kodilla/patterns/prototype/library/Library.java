package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    final String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Library shallowClone() throws CloneNotSupportedException {
        return super.clone();
    }


    public Library deepClone() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book book : books) {
            Book clonedBook = new Book(book.title, book.author, book.publicationDate);
            clonedLibrary.books.add(clonedBook);
        }
        return clonedLibrary;
    }

    public Set<Book> getBooks() {
        return books;
    }
}
