package com.newjava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String arg[]) {

        // filter, map, limit, reduce, find, match, and so on
        List<Integer> list = Arrays.asList(10, 2, 8, 20, 1, 3);


       list =  list.stream().filter(i -> i != 2).sorted().collect(Collectors.toList());
        System.out.println("filtering : "+list.toString());


      list =   list.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println("map: "+list.toString());

        System.out.println(list.stream().limit(3).findFirst().orElse(1));
        System.out.println("limit: "+list.toString());


        System.out.println(list.stream().collect(Collectors.toList()));

    }
}
