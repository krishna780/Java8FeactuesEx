package com.example.java8feactuesex;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Objects;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional gender=Optional.of("MALE");
        String answer1="Yes";
        String answer2=null;
        System.out.println("non empty "+gender);
        System.out.println("non empty "+gender.get());
        System.out.println("non djdk empty "+Optional.empty());
        System.out.println("non of nullable empty " +Optional.ofNullable(answer2));
    //    System.out.println("non of of empty " +Optional.of(answer2));

        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = null;
        System.out.println("non EmptyGender "+nonEmptyGender.map(String::length));
     //   System.out.println(" EmptyGender "+emptyGender.map(String::length));
     //   System.out.println("equal EmptyGender "+emptyGender.filter(g->g.equals("ma")));
        if( !Objects.isNull(emptyGender) || !ObjectUtils.isEmpty(emptyGender)) {
            System.out.println("empty djdndjj"+emptyGender);
            Optional<String> optional = emptyGender.filter(g -> g.equals("ma"));
            System.out.println("optional" + optional);
        }
    }
}
