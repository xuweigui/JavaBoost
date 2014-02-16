package com.windrift.scjp.general.questions001.question11;

import java.util.Arrays;

/**
 * Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
 at java.lang.String.compareTo(String.java:108)
 at java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:290)
 at java.util.ComparableTimSort.sort(ComparableTimSort.java:157)
 at java.util.ComparableTimSort.sort(ComparableTimSort.java:146)
 at java.util.Arrays.sort(Arrays.java:472)
 at com.windrift.scjp.questions001.question11.SortObject.main(SortObject.java:19)
 at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
 at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 at java.lang.reflect.Method.invoke(Method.java:606)
 at com.intellij.rt.execution.application.AppMain.main(AppMain.java:120)
 */
public class SortObject

{
    public static void main(String[] args)
    {
        Object[] myObjects = {
            new Integer(12),
            new String("foo"),
            new Integer(5),
            new Boolean(true)
        };
        Arrays.sort(myObjects);
        for (int i = 0; i < myObjects.length; i++)
        {
            System.out.print(myObjects[i].toString());
            System.out.print(" ");
        }
    }
}