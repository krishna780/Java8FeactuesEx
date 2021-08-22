package com.example.java8feactuesex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));

        Map<String, Long> collect = list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites));
        System.out.println(collect);
        Map<Long, String> map = list.stream().sorted(Comparator.comparing(Hosting::getWebsites).reversed())
                .collect(Collectors.toMap(Hosting::getWebsites, Hosting::getName, (o1, o2) -> o1, LinkedHashMap::new));
        System.out.println(map);

    }
}
    @Data
    @AllArgsConstructor
    class Hosting{
        private int Id;
        private String name;
        private long websites;
}
