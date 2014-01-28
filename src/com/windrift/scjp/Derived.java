package com.windrift.scjp;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 7/06/12
 * Time: 3:41 PM
 * To change this template use File | Settings | File Templates.
 */
class Base

{

    int i = 99;

    public void amethod()

    {

        System.out.println("Base.amethod()");

    }

    Base()

    {

        amethod();

    }

}

public class Derived extends Base

{

    int i = -1;


    public static void main(String argv[])

    {

        Base b = new Derived();

        System.out.println(b.i);    //99
        System.out.println(((Derived) b).i);  //-1

        b.amethod();
        /*
        The reason is that this code creates an instance of the Derived class but assigns it to a reference
        of a the Base class. In this situation a reference to any of the fields such as i will refer to
        the value in the Base class, but a call to a method will refer to the method in the class type
        rather than its reference handle. But note that if the amethod() was not present in the base class
        then compilation error would be reported as at compile time, when compiler sees the statement
        like b.amethod(), it checks if the method is present in the base class or not.
        Only at the run time it decides to call the method from the derived class
        */


        Parent p = new Child();

        p.method2();

        /**
         * The variable p refers to the Child class object.
         * The statement p.method2() on execution will first look for method2() in Child class.
         * Since there is no method2() in child class, the method2() of Parent class will be invoked
         * and thus "Parent's method2()" will be printed. Now from the method2() ,
         * there is a call to method1(). Please note that method1() of Parent class is private,
         * because of which the same method (method1() of Parent class) will be invoked.
         * Had this method(method1() of Parent class) been public/protected/friendly (default),
         * Child's class method1() would be called.
         */

    }


    public void amethod()

    {

        System.out.println("Derived.amethod()");

    }

}


class Parent

{

    private void method1()

    {

        System.out.println("Parent's method1()");

    }

    public void method2()

    {

        System.out.println("Parent's method2()");

        method1();

    }

}

class Child extends Parent

{

    public void method1()

    {

        System.out.println("Child's method1()");

    }


}