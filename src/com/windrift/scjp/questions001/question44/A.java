package com.windrift.scjp.questions001.question44;


public class A
{
    public String doit(int x, int y)
    {
        return "a";
    }

    public String doit(int... vals)
    {
        return "b";
    }

    public static void main(String[] args)
    {
        A a = new A();
        System.out.println(a.doit(1, 2));       //a
        System.out.println(a.doit(1));          //b
        System.out.println(a.doit(1, 2, 3));    //b
    }
}
