package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Book extends Product {
    private String author;

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        return this.author.equalsIgnoreCase(search);
    }
}
