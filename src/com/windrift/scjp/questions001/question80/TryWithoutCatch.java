package com.windrift.scjp.questions001.question80;

/**
 * @author Gary Xu
 */
public class TryWithoutCatch
{
    public static void test()
    {
        try
        {
            String test = null;
            System.out.println(test.toString() + "");
        }
        finally
        {
            System.out.println("finally");
        }
    }
}
