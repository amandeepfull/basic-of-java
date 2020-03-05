package com.newjava.java8;

import java.util.Optional;

public class OptionalDemo {

    // Introduction
    // 1. It is public final class
    // 2. It is used to deal with NullPointerException in Java application
    // 3. It provides methods to check the presence of value for a particular variable


    public static void main (String... arg)  {


        String[] str = new String[10];
        str[5] = "Amandeep";

        /// ofNullable
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        Optional<String> checkNull1 = Optional.ofNullable(str[3]);
        System.out.println(checkNull.isPresent()); // output : true
        System.out.println(checkNull1.orElse("OrElse for ofNullable")); // output :  OrElse for ofNullable
        System.out.println(checkNull1.orElseThrow(IllegalArgumentException::new)); // output : throws Exception
    }
}
