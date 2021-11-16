package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Smartphone extends Product{
    private String vendor;

    public Smartphone(int id, String name, int price, String vendor) {
        super(id, name, price);
        this.vendor = vendor;
    }

    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        return this.vendor.equalsIgnoreCase(search);
    }
}
