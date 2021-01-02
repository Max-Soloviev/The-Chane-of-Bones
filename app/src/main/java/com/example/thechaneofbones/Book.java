package com.example.thechaneofbones;

public class Book {
    static Page[] createBook() {
        Page[] pagesOfTheBook = new Page[3];
        pagesOfTheBook[0] = new Page("Всупление 1", "Основной текст 1", 0, 2);
        pagesOfTheBook[1] = new Page("Всупление 2", "Основной текст 2", 1, 1);
        pagesOfTheBook[2] = new Page("Всупление 3", "Основной текст 3", 2, 0);
        return pagesOfTheBook;
    }
}
