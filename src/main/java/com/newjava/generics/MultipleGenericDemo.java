package com.newjava.generics;

import java.util.HashMap;
import java.util.Map;

public class MultipleGenericDemo {


    public static void main(String arg[]){

        Dictionary<String, Integer> dictionary = new Dictionary<>();
        dictionary.put("aman", 26);
        dictionary.put("malleswari", 27);
        dictionary.put("mohan", 22);


    }
}


class Dictionary<K extends String, V>{

    Map<K, V> map;


    public void put(K key,  V value){

        if(map == null || map.isEmpty())
            map = new HashMap<>();

        map.put(key, value);

    }

}