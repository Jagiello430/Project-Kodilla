package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        //Creating list books
        Library library = new Library("Collections books 1");
        IntStream.iterate(1,n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("book" + n, "author" + n,LocalDate.now().minusYears(20 + n))));

        //Making shallow clone of object library
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Collections books 2" );
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //Making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Collections books 3");
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(3);
        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(10,library.getBooks().size());
        Assert.assertEquals(10,cloneLibrary.getBooks().size());
        Assert.assertEquals(9,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(cloneLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
