package com.abhijeet;

public class Practice {

    public static void main(String[] args) {
        Laptop1 L1 = new Laptop1();
        L1.Company = "Apple";
        L1.RAM = 4;
        L1.giveSpecification();

        //creation using second type of constructor
        Laptop L2 = new Laptop("Dell",6);
        L2.giveSpecification();

    }
}


class Laptop1{
    String Company;
    int RAM;
    static int LaptopCount;

    //method
    void giveSpecification(){
        System.out.println("This is a "+Company+" laptop and it has "+RAM+"GB RAM");
    }

    //first type of constructor
    public Laptop1(){
        LaptopCount++;
        System.out.println("Laptop Created: "+LaptopCount);
    }

    //second type of constructor
    public Laptop1(String Company, int RAM){
        this(); //since we want to increase the count here also, therefore we are calling the first constructor from the second constructor
        System.out.println("This laptop got created using second type of constructor");
        this.Company = Company;
        this.RAM = RAM;
    }
}