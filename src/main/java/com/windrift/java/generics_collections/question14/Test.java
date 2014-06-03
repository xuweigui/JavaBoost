package com.windrift.java.generics_collections.question14;

/**
 * Created by gary on 3/06/14.
 */
public class Test {
    public <T extends Comparable> T findLarger(T t1, T t2)
    {
        return t1.compareTo(t2) > 0 ? t1 : t2;
    }

    public void test ()
    {
        Object x = findLarger(123, "456");
//        int i = findLarger(123, new Double(456)); //error
        int j = findLarger(123, new Integer(456));
//        int k = findLarger(new Double(123), new Double(456)); //error
    }
}
