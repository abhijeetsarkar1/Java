package com.abhijeet;

public class Main {

    public static void main(String[] args) {

        //creating an object
        Person p1 = new Person();
        p1.name = "Abhijeet";
        p1.age = 24;

        //creating another object
        Person p2 = new Person();
        p2.age = 23;
        p2.name = "Ravi";

        p1.giveIntro();
        p2.Eating();
    }
}

class Person{
    String name;
    int age;

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