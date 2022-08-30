package com.test;
class Parent
{
    public void demo()
    {
        System.out.println("Parent class method");
    }
    
}


class Child extends Parent
{
    public void demo()
    {
        System.out.println("child class method");
    }
}


public class Overriding{

    public static void main(String[] args) {
    
        Parent p=new Child();//Up casting
        p.demo();
    
        Child c=(Child) p;//Down casting
        c.demo();

        Parent p1=new Parent();
        p1.demo();
        
        //int a=(int)12.56;

    }

}









