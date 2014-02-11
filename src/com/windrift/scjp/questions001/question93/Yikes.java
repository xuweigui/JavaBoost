package com.windrift.scjp.questions001.question93;

/**
 * @author Gary Xu
 */
public class Yikes
{
    public static String go(Long n) {return "Long";}
    public static String go(Short n) {return "Short";}
    public static String go(int n) {return "int";}
    public static void main(String[] args)
    {
        short s = 12;
        System.out.println(go(s));
    }
}
