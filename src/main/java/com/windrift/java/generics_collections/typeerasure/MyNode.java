package com.windrift.java.generics_collections.typeerasure;

/**
 * Created by gary on 6/06/14.
 */
public class MyNode extends Node<Integer> {
    public MyNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }

/* cannot define this method here, as the method in Node will be the same as this one after type
    erasure.
    public void setData(Object data) {

    }
*/
}