package com.windrift.java;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 7/06/12
 * Time: 3:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntChar

{

    void myMethod(int i)
    {
        System.out.println("int version");
    }

    void myMethod(String s)
    {
        System.out.println("String version");
    }

    public static void main(String args[])
    {
        IntChar obj = new IntChar();
        char ch = 'c';
        obj.myMethod(ch);     //as char type in java is internally stored as integer and there is a method, which takes int as an input.


        Boolean b = new Boolean("neither true nor false");
        System.out.println(b.booleanValue());
        b = new Boolean("TRUE");
        System.out.println(b.booleanValue());//true in lower case

        test1();
    }

    public static void test1()
    {
        int Output = 10;

        boolean b1 = false;

        if ((b1 == true) && ((Output += 10) == 20))

        {

            System.out.println("We are equal " + Output);

        }

        else

        {

            System.out.println("Not equal! " + Output);

        }
    }
}
