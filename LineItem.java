package com.example.java8feactuesex;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter @Setter
@AllArgsConstructor
@SuperBuilder
@ToString
public class LineItem {
    private Integer id;
    private String item;
    private Integer qty;
    private BigDecimal price;
    private BigDecimal total;
}
