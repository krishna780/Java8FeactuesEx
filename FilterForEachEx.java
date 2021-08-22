package com.example.java8feactuesex;

import java.util.List;

public class FilterForEachEx {
    public static void main(String[] args) {
        List<String> list = List.of("peter", "sam", "greg", "ryan");
        list.stream().filter(s -> !s.equals("ryan")).forEach(System.out::println);

    }
}
