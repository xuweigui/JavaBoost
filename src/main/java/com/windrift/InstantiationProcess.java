package com.windrift;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 18/06/12
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class InstantiationProcess {
    public static void main(String[] args) {
        new Child();
        //6 3 1 print 2 4 print 5
    }
}


class Parent{
    {System.out.println("1");}
    Parent(int x) {
        System.out.println("2");
    }
    static {System.out.println("6");}
    
    
    String print() {
        System.out.println("print");
        return "";
    }
    
    String a = print();
}

class Child extends Parent{
    static {System.out.println("3");}
    {System.out.println("4");}
    Child () {
        super(3); //super must be the first line
        System.out.println("5");
    }
    
    String b = print();
}