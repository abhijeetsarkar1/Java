package com.abhijeet.encapsulation;

public class EncapsulationIntro {
    public static void main(String[] args) {
        Pencil p1 = new Pencil();
        p1.Name = "Apsara";
        p1.setPrice(5);
        int price = p1.getPrice();
        System.out.println("Price is: "+price);
        /*
        p1.Price = 50;
        //but I dont want the price to be changed by anyone
        */
    }

    public void publicFunction(){

        System.out.println("This is a public function which is being accessed in main class.");
        //so this function is available in all the packages.
    }

    void packageAccessFunction(){   // this is called default
        System.out.println("has the access inside this encapsulation package.");
    }

    private void privateAccessFunction(){
        System.out.println("has the access in this lass only.");
    }

    //protected can be used when the properties are to be made accessible only to the child classes, and in this case the child class can  be in any oackage.
}

class Pencil{
    String Name;
    private int Price;

    public int getPrice() {     //alt+insert is the shortcut for generating getter and setter.
        return Price;
    }

    //you have to use getter and setter function in order to change the price now.
    public void setPrice(int Price){
        boolean isAdmin = true; //can be set to false also
        if (!isAdmin){
            System.out.println("Only admin can set the price.");
        } else {
            this.Price = Price;
        }
    }
}
