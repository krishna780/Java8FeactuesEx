package com.example.java8feactuesex;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemovingNullEx {
    public static void main(String[] args) {
        String str="welcome to Java";
        IntStream chars = str.chars();
        Stream<Character> characterStream = chars.mapToObj(e -> (char) e);
        Map<Character, Long> output = characterStream.collect(Collectors.groupingBy(ch->ch,Collectors.counting()));

        String lines = "I Love Java 8 Stream!";
        Map<String, Long> collect = Arrays.stream(lines.split("")).filter(x->!x.equals(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
