package com.example.java8feactuesex;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMap {
    public static void main(String[] args) {
        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");

        String collect = HOSTING.entrySet().stream().filter(s -> {
                    if (!s.getValue().contains("amazon") && !s.getValue().contains("digital")) {
                        return true;
                    }
                    return false;
                })
                .map(map -> map.getValue())
                .collect(Collectors.joining(","));
        System.out.println(collect);

        StringJoiner stringJoiner=new StringJoiner(",","4","5");
        stringJoiner.add("sjeeooe");
        stringJoiner.add("jsjje");
        stringJoiner.add("eeooe");
        stringJoiner.add("je");
        stringJoiner.add("ooe");
        stringJoiner.add("msjje");
        System.out.println(stringJoiner);

        Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime)
                .limit(168)
                .forEach(x -> System.out.format("%s\t", x));

    }
}
