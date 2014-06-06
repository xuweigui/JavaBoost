package com.windrift.java.generics_collections.typeerasure;

/**
 * Created by gary on 6/06/14.
 */
public class Main {

    public static void main(String[] args) {
        MyNode mn = new MyNode(5);
        Node n = mn;            // A raw type - compiler throws an unchecked warning
        n.setData("Hello");     // Causes a ClassCastException to be thrown.
        Integer x = mn.getData();
    }
}
