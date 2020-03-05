package com.newjava.java8;


import java.util.Arrays;
import java.util.List;

public class MethodReference {


    // Introduction :
    // 1. It is compact way to implement lambda


    /// It can be implemented in three ways

    // 1. a static method
    // 2. an instance method
    // 3. a constructor


    private String str;

    public String getStr() {
        return this.str;
    }

    public MethodReference(String str) {
        this.str = str;
    }

    public MethodReference() {

    }

    public static void callByStaticRef(String str) {
        System.out.println(str);
    }

    public void callByInstanceRef(String str) {
        System.out.println(str);
    }

    public static void main(String arg[]) {


        List<String> list = Arrays.asList("123123", "323423432");


        System.out.println("Printing by static reference");
        list.forEach(MethodReference::callByStaticRef);
        System.out.println("============================");

        System.out.println("Printing by instance reference");
        list.forEach(new MethodReference()::callByInstanceRef);
        System.out.println("============================");


        System.out.println("creating instance");
        list.forEach(MethodReference::new);
        System.out.println("============================");


        System.out.println("Creating object using constructor");
        Object[] strs = list.stream().map(MethodReference::new).toArray();
        for (Object methRef : strs) {
            System.out.println((((MethodReference)methRef)).getStr());
        }
        System.out.println("===============================");


    }
}
