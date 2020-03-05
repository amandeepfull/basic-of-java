package com.newjava;

public class ThreeDots {


    public void getParameters(Object... userProperties){

        System.out.println("size of properties "+userProperties.length);

        for(Object userProperty : userProperties)
            System.out.println(userProperty);

    }
    public static void main(String... arg){


        new ThreeDots().getParameters("amandeep", "amandeep@gmail.com", 30, 15000000);
    }
}
