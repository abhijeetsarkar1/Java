package com.abhijeet;

public class Inheritance {

    public static void main(String[] args) {
        Laptop L1 = new Laptop("Apple",4);

        L1.giveSpecification();

        //creation using second type of constructor
        Laptop L2 = new Laptop("Dell",6);
        L2.giveSpecification();

        Mobile m1 = new Mobile("Samsung" , 4);  //always remember that every object being created in Java has a parent class named Object. It's kind of like a super parent

        //so here giveSpecification is kind of like a .... run time polymorphism..... because while running it will check if giveSpecification is present in current class or will it have to go to parent class fot that method.
        m1.giveSpecification();  // it will look for the giveSpecification method in the nearest parent if the method is absent in the current class-> Mobile.
        //however since we have already created a giveSpecification method here in Mobile class... it will use that itself

    }
}

//making a new class mobile which inherits the properties of a Laptop
class Mobile extends Laptop{

    public Mobile(String Company, int RAM) {
        super(Company, RAM);
    }

    void giveSpecification(){
        System.out.println("This is a "+Company+"'s mobile with "+RAM+"GB RAM.");
    }
}

class Laptop{
    String Company;
    int RAM;


    //method
    void giveSpecification(){
        System.out.println("This is a "+Company+" laptop and it has "+RAM+"GB RAM");
    }


    public Laptop(String Company, int RAM){
        System.out.println("This laptop got created using second type of constructor");
        this.Company = Company;
        this.RAM = RAM;
    }
}