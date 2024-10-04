package com.streamapi;


import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {

        //test data
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Java");
        IntPredicate evenOnly = x -> x % 2 == 0;
        Predicate<Integer> evenOnlyPredicate = x -> x % 2 == 0;

        // intermediate operations
        // map
        List<Integer> square = numbers
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        square.forEach(System.out::println);

        // filter
        List<String> result = names
                .stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        //sorted
        List<String> sorted = names
                .stream()
                .sorted()
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);

        //terminal operations
        // collect
        Set<Integer> squareSet = numbers
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());
        squareSet.forEach(System.out::println);

        // forEach

    }

}
