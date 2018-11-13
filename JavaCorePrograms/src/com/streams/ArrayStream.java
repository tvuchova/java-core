package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String args[]) {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

   /* Stream.of("a1", "a2", "a3")
        .findFirst()
    .ifPresent(System.out::println);*/
}
