package com.example.java8feactuesex;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstLastEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2);
        Optional<Integer> first = list.stream().findAny();
        if(first.isPresent()){
            System.out.println(first.get());
        }

    }
}

