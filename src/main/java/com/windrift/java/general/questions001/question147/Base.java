package com.windrift.java.general.questions001.question147;

/**
 * @author Gary Xu
 */
public class Base
{
    public static final String FOO = "foo";
    public String show()
    {
        return FOO;
    }
    public static void main(String[] args)
    {
        Base b = new Base();
        Sub s = new Sub();
        System.out.print(Base.FOO);
        System.out.print(Sub.FOO);
        System.out.print(b.FOO);
        System.out.print(s.FOO);
        System.out.print(((Base)s).FOO);
        System.out.print(((Base)s).show());
    }
    private int a;
}

class Sub extends Base {
    public static final String FOO = "bar";
    public String show()
    {
        return FOO;
    }
}
