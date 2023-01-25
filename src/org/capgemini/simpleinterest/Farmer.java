package org.capgemini.simpleinterest;

import java.util.Scanner;

public class Farmer {
    //principal,time and simple interest
    float p,t,si;
    //rate
    static float r;
     void input(){
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter principal");
         p=scan.nextFloat();
         System.out.println("Enter time");
         t=scan.nextFloat();
     }

     static{
         r=2.5f;
     }
     void calSI(){
         si=p*t*r/100;
     }
     void display(){
         System.out.println("Simple interest is "+si);
     }
}

/*In the design of an application if the variable has a common value for all the
objects ,then we should declare such variables as static variables.*/

