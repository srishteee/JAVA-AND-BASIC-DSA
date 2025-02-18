package comparableAndComparator;

import java.util.Comparator;

//Write a Java class that implements Comparable for a class called Book based on the book's title.
public class Book implements Comparable<Book> {

    String title;

    Book(String title){
        this.title=title;
    }

    @Override
    public int compareTo(Book obj) {
        return this.title.compareTo(obj.title);
    }
}
