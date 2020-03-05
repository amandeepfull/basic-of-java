package com.newjava.generics;

import java.util.ArrayList;
import java.util.List;

public class BagGenerics {

    public static void main(String arg[]){

        Bag<Coin> coinBag = new Bag<>();


        Coin coin_1 = new Coin();
        coin_1.setValue("1");

        Coin coin_2 = new Coin();
        coin_2.setValue("2");

        Coin coin_3 = new Coin();
        coin_3.setValue("3");

        Coin coin_4 = new Coin();
        coin_4.setValue("4");

        Coin coin_5 = new Coin();
        coin_5.setValue("5");

        coinBag.add(coin_1);
        coinBag.add(coin_2);
        coinBag.add(coin_3);
        coinBag.add(coin_4);
        coinBag.add(coin_5);


        Bag<Money> moneyBag = new Bag();

        Money money_1 = new Money();
        money_1.setValue("6");

        Money money_2 = new Money();
        money_2.setValue("7");

        Money money_3 = new Money();
        money_3.setValue("8");

        Money money_4 = new Money();
        money_4.setValue("9");

        Money money_5 = new Money();
        money_5.setValue("10");

        moneyBag.add(money_1);
        moneyBag.add(money_2);
        moneyBag.add(money_3);
        moneyBag.add(money_4);
        moneyBag.add(money_5);


        System.out.println("Coins =======================");
        coinBag.showAllDenominations();
        System.out.println("===============================");
        System.out.println("Money===========================");
        moneyBag.showAllDenominations();
        System.out.println("===============================");

    }

}


interface Denomination {
     void setValue(String value);
     String getValue();
}

class Bag<T extends Denomination>{

    private List<T> list;

    public  <U extends T> void  add(U u){ // bounded type parameters

        if (this.list == null || this.list.isEmpty())
            this.list = new ArrayList<>();

        this.list.add(u);
    }

    public void showAllDenominations(){

        for(Denomination denomination : this.list){
            System.out.println(denomination.getValue());
        }
    }

}

class Coin implements Denomination{

    private String value;

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}

class Money implements Denomination{

    private String value;

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}

