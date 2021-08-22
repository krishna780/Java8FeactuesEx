package com.example.java8feactuesex;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@SuperBuilder
@ToString
public class Order {
    private Integer id;
    private String invoice;
    private List<LineItem> lineItems;
    private BigDecimal total;
}
