package com.newjava.functionalProgramming.string;

public class Main {

    public static void main(String arg[]) {
        System.out.println(StringConverter.convert(() -> StringUtil.getSize("ajsdjfldsjf")));
        System.out.println(StringConverter.convert(() -> StringUtil.toLowerCase("sldjflsdjf")));
        System.out.println(StringConverter.convert(() -> StringUtil.toUpperCase("sldjflsdjlfjsdf")));
    }

}
