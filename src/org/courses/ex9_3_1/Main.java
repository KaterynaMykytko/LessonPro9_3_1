package org.courses.ex9_3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Майже наречена", 4, Genre.COMEDY));
        books.add(new Book("Christmas story", 9, Genre.COMEDY));
        books.add(new Book("Sherlock Holmes story", 5, Genre.STORY));
        books.add(new Book("Сім сестер", 9, Genre.NOVEL));
        books.add(new Book("До зустрічі з тобою", 11, Genre.NOVEL));
        books.add(new Book("Темний ліс", 15, Genre.FANTASTIC));
        books.add(new Book("Втримати небо", 3, Genre.FANTASTIC));
        books.add(new Book("Дюна", 58, Genre.FANTASTIC));
        books.add(new Book("Важко бути богом", 59, Genre.FANTASTIC));
        books.add(new Book("Сіддхартха", 11, Genre.NOVEL));


        Predicate<Book> predicate1 = book -> book.getAge() > 10;
        Consumer<Book> consumer1 = book -> System.out.println(book);

        books
                .stream()
                .filter(predicate1)
                .forEach(consumer1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        Predicate<Book> predicate2 = book -> book.getGenre() == Genre.FANTASTIC;
        Consumer<Book> consumer2 = book -> System.out.println(book);

        books
                .stream()
                .filter(predicate2)
                .forEach(consumer2);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        Predicate<Book> predicate3 = book -> book.getName().contains("story");
        Consumer<Book> consumer3 = book -> System.out.println(book);

        books
                .stream()
                .filter(predicate3)
                .forEach(consumer3);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        Function<Book, Article> function = book -> new Article(book.getGenre(), book.getName());

        books
                .stream()
                .map(function)
                .forEach(article -> System.out.println(article));
    }
}

record Article(Genre genre, String name) {

}
