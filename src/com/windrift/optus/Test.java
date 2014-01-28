package com.windrift.optus;

import java.security.PublicKey;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 6/06/12
 * Time: 4:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test{
    public static void main (String[] args) {
        int x = 0;
        Person p = new Person();
        new Test().doIt(x, p);
        System.out.print(x + " " + p.number);

        byte b = (byte) 255;

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.run();
        t2.run();
        System.out.print("three ");
        t1.text = "one ";
        t1.text = "two ";

        int i = new Integer("56");
        System.out.print(i);

        Person p1 = null;
        try {
               p1.number = 5;
        } catch (NullPointerException n)  {
            System.out.print("NullPointerException ");
        } catch (Exception e) {
            System.out.print("Exception ");
        }

        System.out.print("ok");
    }
    public void doIt(int i, Person p) {
         i = 5;
        p.number = 8;
    }
}
class Person {
    public int number;
static void f () {

}}

class Student extends Person {
    static void f() {

    }
}

class MyThread extends Thread {
    public String text;
    public void run() {
        System.out.print(text);
    }
}


enum  Te {
    A,B;
    static int a;
    static void f() {

    }

}