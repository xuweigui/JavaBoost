package com.windrift.java.generics_collections.question10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gary Xu
 */
public class MissMatch
{
    public static void append(List list) { list.add("0042"); }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        append(intList);
        System.out.println(intList.get(0));    // 0042
        Integer i = intList.get(0);   //ClassCastException
   }
}
