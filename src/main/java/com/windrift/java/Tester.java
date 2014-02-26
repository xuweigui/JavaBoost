package com.windrift.java;

/**
 * @author Gary Xu
 */
public class Tester
{
    public static void main(String[] args)
    {
        int x=6;
        Tester t = new Tester();
        t.doStuff(x);
        System.out.print(" main x = "+ x);
    }

    private void doStuff(int x)
    {
        System.out.print(" doStuffx = "+ x++);
    }


}
