package com.windrift.other;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ClassCastExceptionOnToArray
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();
        String[] strArray = new String[]{"a", "b"};
        set.addAll(Arrays.asList(strArray));

        test(set.toArray(new String[set.size()])); //ok
        test((String[])set.toArray()); // ClassCastException

    }

    private static void test(String[] strs)
    {
        System.out.println("in test");
    }
}
