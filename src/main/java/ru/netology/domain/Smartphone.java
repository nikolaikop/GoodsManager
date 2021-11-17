package ru.netology.domain;

import lombok.EqualsAndHashCode;
import lombok.Data;

@Data
@EqualsAndHashCode(callSuper = true)

public class Smartphone extends Product{
    private String vendor;

    public Smartphone(int id, String name, int price, String vendor) {
        super(id, name, price);
        this.vendor = vendor;
    }
}
