package com.abhijeet.basics;

public class Helicopter implements fan,fly{
    public static void main(String[] args) {
        Helicopter h1 = new Helicopter();
        h1.rotate();
        h1.flying();
    }

    @Override
    public void rotate() {
        System.out.println("Fan has started rotating.");
    }

    @Override
    public void flying() {
        System.out.println("It has started flying.");
    }
}

/*
1. It is assumed that the classes which are using interface will have PUBLIC, ABSTRACTION methods only.
2. Basically interface is a TRUE abstraction because you are not given the power to define the functions.
 */

interface fan{
    void rotate();
    //you cannot define the body of this method because it is by default assumed that the method is a public as well as an abstraction method.
}

interface fly{
    void flying();
}