package com.example.java8feactuesex;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByEx {
    public static void main(String[] args) {
      /*  List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");
        Map<String, Long> collect = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        Map<String, Long> finalMap = new LinkedHashMap<>();
        collect.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEachOrdered(e->finalMap.put(e.getKey(), e.getValue()));
        System.out.println(finalMap);
*/

        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99")));
        Map<BigDecimal, Long> listMap = items.stream().collect(Collectors.groupingBy( Item::getPrice, Collectors.counting()));
   //     System.out.println(listMap);

        Map<BigDecimal, List<Item>> collect = items.stream().collect(Collectors.groupingBy(Item::getPrice));
        System.out.println(collect);

        Map<BigDecimal, Set<String>> map = items.stream().collect(Collectors.groupingBy(Item::getPrice,
                Collectors.mapping(Item::getName, Collectors.toSet())));
        System.out.println(map);
        Set<String> aLong = items.stream().collect(Collectors.mapping(Item::getName, Collectors.toSet()));
        System.out.println(aLong);


    }
}
