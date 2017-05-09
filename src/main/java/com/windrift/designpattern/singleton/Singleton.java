package com.windrift.designpattern.singleton;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 15/05/12
 * Time: 9:44 PM
 * a single-element enum type is the best way to implement a singleton
 */
public class Singleton {
  public static void main (String[] args) {
      Singleton1 s1 = Singleton1.INSTANCE;
      s1.doSomething();
      Singleton2 s2 = Singleton2.getInstance();
      s2.doSomething();
      Singleton3.INSTANCE.doSomething();
    }

}

/**
 * the instance itself is made public
 */
class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1 () {}

    public void doSomething() {
        System.out.println("Singleton1 with public static instance");
    }
}

class Singleton2 {
    private static final Singleton2 instance = new Singleton2();
    private Singleton2 () {}
    public static Singleton2 getInstance () {return instance;}
    public void doSomething() {
        System.out.println("Singleton2 with getInstance method");
    }

}

//java 1.5 way of singleton
//a single-element enum type is the best way to implement a singleton
enum Singleton3 {
    INSTANCE;


    private String name = "Singleton 3";

    public void doSomething() {
        System.out.println("Singleton3 with java 1.5 enum " + this.name);
    }
}

