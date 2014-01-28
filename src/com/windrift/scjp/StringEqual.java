package com.windrift.scjp;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 7/06/12
 * Time: 3:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringEqual

{

    static String s1 = "I am unique!";

    public static void main(String args[])

    {

        String s2 = "I am unique!";

        String s3 = new String(s1);  //create a new one, so never use this.

        System.out.println(s1 == s2); //true

        System.out.println(s1.equals(s2));  //true

        System.out.println(s3 == s1);       //false

        System.out.println(s3.equals(s1));   //true

        System.out.println(TestClass.s4 == s1);  //true

    }

}


class TestClass

{

    static String s4 = "I am unique!";

}

/*
Strings are immutable objects. That is, a string is read only once the string has been created and initialized,
and Java optimizes handling of string literals; only one anonymous string object is shared by all string
literals with the same contents. Hence in the above code the strings s1, s2 and s4 refer to the same
anonymous string object, initialized with the character string: "I am unique!". Thus s1 == s2 and TestClass.s4
will both return true and obviously s1.equals(s2) will return true. But creating string objects using the
constructor String(String s) creates a new string, hence s3 == s1 will return false even though s3.equals(s1)
will return true because s1 and s3 are referring to two different string objects whose contents are same.
*/