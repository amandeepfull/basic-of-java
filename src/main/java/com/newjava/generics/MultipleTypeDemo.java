package com.newjava.generics;

public class MultipleTypeDemo {

    public static void main(String arg []){

        Glass<OrangeJuice> glass = new Glass<>(); // valid statement because OrangeJuice extends Juice and implements Liquid interface which is necessory by Glass

       // Glass<AppleJuice> glass1 = new Glass<AppleJuice>(); // invalid statement because it is not implementing Liquid interface

    }
}


class Glass<T extends Juice & Liquid>{  // classes should be first then interface

}

class Juice{

}

interface Liquid{

}

class AppleJuice extends Juice{

}


class OrangeJuice extends Juice implements Liquid {

}
