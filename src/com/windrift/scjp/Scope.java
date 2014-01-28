package com.windrift.scjp;

/**
 * Created with IntelliJ IDEA.
 * User: cy
 * Date: 23/12/12
 * Time: 9:11 PM
 * To change this template use File | Settings | File Templates.
 */
class NewStringClass
{
    public static void main(String[] args)
    {
        //String s = "abc"; //left is NewStringClass.String, right is java.lang.String
        java.lang.String s = "abc";
        System.out.println(s);
    }

    class String
    {
        public String(String s)
        {
            System.out.println(s);
        }
    }
}
