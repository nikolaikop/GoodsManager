package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product book1 = new Book(1, "Last Symbol", 1034, "Dan Brown");
    private Product book2 = new Book(2, "Shantaram", 2745, "Gregory David Roberts");
    private Product book3 = new Book(3, "Dune", 1562, "Frank Gerbert");
    private Product phone1 = new Smartphone(1, "Iphone XR", 15500, "Apple");
    private Product phone2 = new Smartphone(2, "Nokia 3310", 7930, "Nokia");
    private Product phone3 = new Smartphone(3, "Samsung Galaxy S2", 11390, "Samsung");
    private Product phone4 = new Smartphone(4, "Samsung A2", 10144, "Samsung");
    private Product anyProduct = new Product(1, "product", 1000);

    @Test
    void BookNameMatch() {
        boolean actual = book2.matches("Shantaram");
        assertTrue(actual);
    }

    @Test
    void BookNameDoesntMatch() {
        boolean actual = book1.matches("Dune");
        assertFalse(actual);
    }

    @Test
    void PhoneNameMatch() {
        boolean actual = phone4.matches("Samsung A2");
        assertTrue(actual);
    }
}