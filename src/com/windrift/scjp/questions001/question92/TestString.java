package com.windrift.scjp.questions001.question92;

/**
 * @author Gary Xu
 */
public class TestString
{
    public static String test1()
    {
        StringBuilder s = new StringBuilder("123456789");
        s.delete(0, 3).delete(1, 3).delete(2, 5).insert(1, "24");
        return s.toString();
    }

    public static String deleteFromStringBuilder()
    {
        StringBuilder s = new StringBuilder("abc");
        s.delete(1, 9999999);
        return s.toString();
    }
}
