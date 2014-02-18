package com.windrift.java;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 7/06/12
 * Time: 9:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Override
{
}

class Parent1
{
    Object doSomething(int x)
    {
        return null;
    }
}

class Child1 extends Parent1
{
    @java.lang.Override
    String doSomething(int x)
    { //when changing the return type during overriding, return type in child class should be a subclass of the parent method
        return null;
    }
}

class Child2 extends Parent1
{
    Double doSomething(int x)
    {
        return null;
    }
}