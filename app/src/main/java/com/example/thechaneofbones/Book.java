package com.example.thechaneofbones;

public class Book {
    static Page[] createBook() {
        Page[] pagesOfTheBook = new Page[6];
        pagesOfTheBook[0] = new Page("Всупление 1", "Основной текст 1", 2, 2);
        pagesOfTheBook[1] = new Page("Всупление 2", "Основной текст 2", 4, 1);
        pagesOfTheBook[2] = new Page("Всупление 3", "Основной текст 3", 1, 3);
        pagesOfTheBook[3] = new Page("Всупление 4", "Основной текст 4", 0, 4);
        pagesOfTheBook[4] = new Page("Всупление 5", "Основной текст 5", 5, 1);
        pagesOfTheBook[5] = new Page("Всупление 6", "Основной текст 6", 4, 0);
        return pagesOfTheBook;
    }
}