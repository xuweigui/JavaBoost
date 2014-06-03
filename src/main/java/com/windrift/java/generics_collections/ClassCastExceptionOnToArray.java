package com.windrift.java.generics_collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;


/**
 * Collection.toArray() returns Object[]
 * Collection.toArray(T[]) returns T[]
 * Array does not use generic while collections use.
 */
public class ClassCastExceptionOnToArray
{
    public static void main(String[] args)
    {
        Collection<String> set = new HashSet<>();
        String[] strArray = new String[]{"a", "b"};
        set.addAll(Arrays.asList(strArray));

        test(set.toArray(new String[set.size()])); //ok
        test(set.toArray(new String[1])); //ok
        test((String[])set.toArray()); // ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.String;

    }

    private static void test(String[] strs)
    {
        System.out.println("in test");
    }
}
