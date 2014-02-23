package com.windrift.java.innerclass;

/**
 * Created with IntelliJ IDEA.
 * User: cy
 * Date: 23/12/12
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
interface ABC
{
    // even the final is not necessary here,
    final class One
    {
        int i = 25;
        static int j = 50;
    }
}

class Two implements ABC
{
    public static void main(String args[])
    {
        System.out.println(ABC.One.j);   //50
        One one = new One();
        System.out.println(one.i); //25
    }
}
