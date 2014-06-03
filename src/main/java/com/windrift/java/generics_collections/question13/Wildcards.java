package com.windrift.java.generics_collections.question13;

import com.windrift.java.StringEqual;
import com.windrift.java.generics_collections.ClassCastExceptionOnToArray;

import java.util.List;

/**
 * Created by gary on 3/06/14.
 */
public class Wildcards {

    class L1 {};
    class L2 extends L1 {};
    class L3 extends L2 {};

    public void m1(List<? super L2> list)
    {
        //expect to have super class of L2, so L2 and L3 which are subclasses of L2 can be used.
        list.add(new L3());
        list.add(new L2());
        //list.add(new L1()); //error
    }

    public void m2(List<? extends L2> list)
    {
/* all error. you don't know how many subclasses can L2 have, so use any of the sub class is not safe.
        list.add(new L1());
        list.add(new L2());
        list.add(new L3());
*/
    }
}
