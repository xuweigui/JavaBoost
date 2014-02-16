package com.windrift.scjp.generics_collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: cy
 * Date: 23/12/12
 * Time: 5:27 PM
 * To change this template use File | Settings | File Templates.
 */
class TreeMapAutoSorting
{
    public static void main(String[] args)
    {
        TreeMap tm = new TreeMap();
        tm.put("abc", "three");
        tm.put("1", "one");
        tm.put("2", "two");
        tm.put("ABC", "four");

        Set set = tm.entrySet();
        Iterator i = set.iterator();

        while (i.hasNext())
        {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getValue() + " ");   //one two four three
            //the tree map will automatically sort the key.
        }

    }
}
