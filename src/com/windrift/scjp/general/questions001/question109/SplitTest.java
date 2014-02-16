package com.windrift.scjp.general.questions001.question109;

/**
 * @author Gary Xu
 */
public class SplitTest
{
    public static int split()
    {
        String test = "This is a test";
        String[] tokens = test.split("\\s");
        return tokens.length;
    }

    public static void main(String[] args)
    {
        System.out.println(split());
//        System.out.format("Pi is approximately %d.", Math.PI);
    }
}
