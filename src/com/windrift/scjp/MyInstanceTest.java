package com.windrift.scjp;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 7/06/12
 * Time: 2:44 PM
 * To change this template use File | Settings | File Templates.
 */
interface MyInterface

{

}

public class MyInstanceTest implements MyInterface

{

    static String s;

    public static void main(String args[])

    {

        MyInstanceTest t = new MyInstanceTest();

        if (t instanceof MyInterface)

        {

            System.out.println("I am true interface");

        }
        else

        {

            System.out.println("I am false interface");

        }

        if (s instanceof String)

        {

            System.out.println("I am true String");

        }
        else

        {

            System.out.println("I am false String");

        }

    }

}

/*
E is the correct choice.

The `instanceof` operator tests the class of an object at runtime.
It returns true if the class of the left-hand argument is the same as,
or is some subclass of, the class specified by the right-hand operand.
The right-hand operand may equally well be an interface.
In such a case, the test determines if the object at left-hand argument implements the specified interface.

In the above case there will not be any compile time or runtime error.
The result of `t` instance of MyInterface will be true as `t` is the object of MyInstanceTest class
which implements the MyInstance interface.
But the result of `s instanceof String` will be false as `s` refers to null.
 Thus the output of the above program will be : `I am true interface` followed by: `I am false String`.
 Thus choice E is correct and others are incorrect.

*/