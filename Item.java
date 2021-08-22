package com.example.java8feactuesex;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Item {
    private String name;
    private int qty;
    private BigDecimal price;
}
