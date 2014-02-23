package com.windrift.java.flowcontrol;

/**
 * Created with IntelliJ IDEA.
 * User: cy
 * Date: 23/12/12
 * Time: 8:32 PM
 * To change this template use File | Settings | File Templates.
 */
class ReturnInFinally
{
    public static void main(String[] args)
    {
        System.out.println(test());    //false
    }

    static boolean test()
    {
        try
        {
            return true;
        }
        finally
        {
            return false;
        }
    }
}

/**
 * result is One
 */
class ExitBeforFinally
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("One");
            System.exit(0);
        }
        finally
        {
            System.out.println("Two");
        }

    }
}
