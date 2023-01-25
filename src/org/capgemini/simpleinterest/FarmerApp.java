package org.capgemini.simpleinterest;

public class FarmerApp {
    public static void main(String[] args){
        //three farmers
        Farmer f1=new Farmer();
        Farmer f2=new Farmer();
        Farmer f3=new Farmer();

        //get principal and time of Farmer1
        f1.input();
        //calculating simple interest
        f1.calSI();
        //display the simple interest
        f1.display();


        //get principal and time of Farmer2
        f2.input();
        //calculating simple interest
        f2.calSI();
        //display the simple interest
        f2.display();

        //get principal and time of Farmer3
        f3.input();
        //calculating simple interest
        f3.calSI();
        //display the simple interest
        f3.display();
    }
}
