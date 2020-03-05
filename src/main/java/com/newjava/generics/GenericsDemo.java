package com.newjava.generics;


///

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// 1. T for type, and E for Element, but we can have any alphabet
// 2. ?
// 3. extends
// 4. super
// 5. bounded parameters: classes should have Inheritance relationship
// 6. multiple bounded parameters


public class GenericsDemo {

    public static void main(String arg[]) {

        Container<Integer> obj = new Container<>();

        obj.add(10);


        NumberContainer<Number> numberContainer = new NumberContainer();

        List<Long> integers = new ArrayList<>();
        integers.add(20L);
        integers.add(30L);

        numberContainer.addAll(integers);

//        for (Object data : numberContainer.getList()){
//            System.out.println(data);
//        }

    }
}

// can except all type of class in list
class Container<T> {

    private List<T> list;


    public void add(T value) {

        if (list == null || list.isEmpty())
            list = new ArrayList<T>();

        this.list.add(value);
    }

    public T get(int index) {

        if (list == null || list.isEmpty())
            return null;

        return this.list.get(index);
    }


    public void addAll(List<T> list){

        if (list == null || list.isEmpty())
            return;

        if (this.list == null || this.list.isEmpty())
            this.list = new ArrayList<T>();

        this.list.addAll(list);

    }
}


/// bounded type parameters


class NumberContainer<T extends Number>{

    private List<T> list;



    public List<T> getList(){
        return list;
    }

    public void add(T value) {

        if (list == null || list.isEmpty())
            list = new ArrayList<>();

        this.list.add(value);
    }

    public T get(int index) {

        if (list == null || list.isEmpty())
            return null;

        return this.list.get(index);
    }


    public void addAll(Collection<? extends T> list){

        // accept parameter which is subclass of intialized generic class,
        //eg : NumberContainer<Number> numberContainer = new NumberContainer()
        // List<Integer> will work to addAll integers because Integer extends Number

        if (list == null || list.isEmpty())
            return;

        if (this.list == null || this.list.isEmpty())
            this.list = new ArrayList();


        System.out.println(list);
        this.list.addAll(list);

    }


}
