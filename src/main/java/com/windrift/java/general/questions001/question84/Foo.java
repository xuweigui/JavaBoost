package com.windrift.java.general.questions001.question84;

/**
 * @author Gary Xu
 */
public class Foo
{
    static int[] a;
    //static int[] a = new int[1]; is OK
    static
    {
        a[0] = 2;
    }

    public static void main(String[] arg)
    {

    }
}
