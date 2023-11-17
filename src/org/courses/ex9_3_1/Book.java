package org.courses.ex9_3_1;

/*
Створити клас Book, зробити 3 поля(Genre(використуйте Enum), String name, int age).
Створіть List з об'єктів класу Book та напишіть лямбда вирази для таких операцій:
1) Вивести у консоль об'єкти класу Book, вік яких більше 10 років
2) Вивести у консоль об'єкти класу Book, жанр яких Фантастика
3) Вивести у консоль об'єкти класу Book, ім'я яких дорівнює "Story"
4) Створити record Article з полями(Genre(використуйте Enum), String name).
 Перетворити колекцію об'єктів класу Book у колекцію об'єктів класу Article
 */

public class Book {

    private String name;
    private int age;
    private Genre genre;


    public Book(String name, int age, Genre genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", genre=" + genre +
                '}';
    }
}
