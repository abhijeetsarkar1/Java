package com.abhijeet.basics;

import com.abhijeet.encapsulation.EncapsulationIntro;

public class Main {

    public static void main(String[] args) {

        //creating an object
        Person p1 = new Person();
        p1.name = "Abhijeet";
        p1.age = 24;

        //creating another object
        Person p2 = new Person();       //here we are using default constructor
        //you always use a constructor while creating an object
        //so basically whatever you are giving after the keyword new-> Person() in this case is a constructor...
        //the default constructor does not take an argument.

        //we are making a constructor class inside the class Person just to verify whether the constructor is really being called in or not....

        p2.age = 23;
        p2.name = "Ravi";

        p1.giveIntro();
        p2.Eating();
        p1.Eating("Ice-cream");     //polymorphism test

        System.out.println("You have created "+Person.ObjectCount+" persons"); //so here we can notice that for accessing ObjectCount from Person class -> and it is independent from my object creation
        //I don't have to create an object in order to access the property created using static keyword.
        //same goes with the main method which we are using above, you dont have to create an object in order to access the main method.

        //in a nutshell you can use static keyword for those propertied which would be independent of object creation and will be a constant for class.

        //making an object with my second constructor
        Person p3 = new Person("Abhijeet2.0",18);
        p3.Eating("dosa"); //referring to the problem noted down....I wanted to make a separate method specially for the second type of constructor but wasn't able to access the properties.
        //so the solution is to initialize those things in second constructor


        //making an object from encapsulation class
        EncapsulationIntro e1 = new EncapsulationIntro();
        e1.publicFunction();
    }
}

class Person{
    protected String name;
    int age;
    static int ObjectCount; //using static here because it is the property of class and not the object.
    //constructor class test
    public Person(){
        ObjectCount++;
        System.out.println("Creating an object. Object number: "+ObjectCount);
    }

    //constructors can be very useful... you can use it if you want the object to have a certain properties while the object is being created.
    //so overloading the constructor class - basically making multiple class

    /**********2nd constructor
    /*public Person(String newName ,int newAge ){
        System.out.println("Made by 2nd constructor. It's name is: "+newName+" of age: "+newAge);
        name = newName;
        age = newAge;
    }
    problem identified:
        newName and newAge are not accessible here for making a separate method for them. -> rectified with the initiation above
     */

    //2nd constructir with the explanation of this keyword
    //now as you would have noticed that we were not increasing the count in second constructor class....in order to do so we need to call the first constructor class in the second one
    public Person(String name, int age){
        this(); //calling the first constructor class and no arguments in this() denotes that we are calling the constructor class where no arguments were given basically the first constructor itself.

        //name = name; will throw an error saying that variable name is being assigned to itself
        //so we need to specify that this.name()-> denoting the name of the first constructor = name provided while constructing in the second constructor.
        this.name = name;
        this.age = age;
    }

    void Eating(){
        System.out.println(name + " is eating right now.");
    }
    void giveIntro(){
        System.out.println("Hi, My name is "+ name+" and I am "+age+" years old.");
    }
    //for the sake of learning polymorphism, so it depends on how are you calling the method
    //based on the way which you are calling the function will check for the appropriate method and that will be executed.
    // this is an example of compiler time polymorphism because if you use cmd+click you will be pointed toewards the appropriate method by complier itself
    //you will see run time polymorphism when you learn inheritance.
    void Eating(String foodItem){
        System.out.println(name + " is eating "+foodItem+" right now.");
    }
}