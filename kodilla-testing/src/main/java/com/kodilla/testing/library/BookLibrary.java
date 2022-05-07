package com.kodilla.testing.library;
import java.util.List;
import java.util.ArrayList;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
            if (titleFragment.length() < 3) return bookList;
            List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
            if (resultList.size() > 20) return bookList;
            bookList = resultList;
            return  bookList;
    }
//     list books borrowed by libraryUser
    public List<Book> listBooksInHandsOf (LibraryUser libraryUser) {
        return libraryDatabase.listBooksInHandsOf(libraryUser);
    }
}
