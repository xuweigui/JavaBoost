package com.windrift.scjp.questions001.question80;

/**
 * @author Gary Xu
 */
public class TryWithoutCatch
{
    public static String test()
    {
        try
        {
            String test = null;
            return test.toString() + "";
        }
        finally
        {
            return "finally";
        }
    }
}
