package com.abhijeet.basics;

public class Abstraction {
    public static void main(String[] args) {

        Audi R8 = new Audi();
        R8.start();
    }
}
/*
actually speaking car is a concept, so we need to create brands out of it as a children class and then
use it.
1. Also you cannot make objects out of an abstract class. You have to make child classes out of it and then make objects from them.
2. Also if you make an abstract function then you need to have the class also as abstract
3. Abstract functions do not have body.
 */

class Audi extends Car{

    @Override
    void start() {
        System.out.println("Audi is starting");
    }
}

class Merci extends Car{
    @Override
    void start(){
        System.out.println("Mercedez is starting.");
    }
}

abstract class Car{
    int Price;

    abstract void start();
}
