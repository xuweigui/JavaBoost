package com.windrift.java.general.questions001.question94;

/**
 * Created by gary on 3/06/14.
 */
public class Wow {
    public static void go(short n) {System.out.println("short"); }
    public static void go(Short n) {System.out.println("SHORT");}
    public static void go(Long n) {System.out.println(" LONG"); }
    public static void go(long n) {System.out.println(" lONG"); }
    public static void main(String [] args) {
        Short y= 6;
        int z=7;
        go(y);
        go(z);
     }
}
