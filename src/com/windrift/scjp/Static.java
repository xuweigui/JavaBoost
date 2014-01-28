package com.windrift.scjp;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 7/06/12
 * Time: 10:36 AM
 * To change this template use File | Settings | File Templates.
 */
class RedefineStatic
{
    static
    {
        int x = 5;
    }

    static int x, y; //static variable can be redefined.

    public static void main(String args[])
    {
        x--; // x = -1
        myMethod();
        System.out.println(x + y + ++x); //3
    }

    public static void myMethod()
    {
        //before x = -1, y = 0
        y = x++ + ++x;
        //after x = 1, y = -1
    }

}

//output is
//first
//third
//second
class StaticBlockInitSequence
{
    static
    {
        System.out.println("first");
    }

    public static void main(String[] args)
    {
        System.out.println("second");
    }

    static
    {
        System.out.println("third");
    }
}
