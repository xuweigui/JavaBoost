package com.windrift.effectivejava.annotation;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 21/05/12
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sample {
    @Test public static void m1() { } // InstantiationProcess should pass
    public static void m2() { }
    @Test public static void m3() { // InstantiationProcess Should fail
        throw new RuntimeException("Boom");
    }
    public static void m4() { }
    @Test public void m5() { } // INVALID USE: nonstatic method
    public static void m6() { }
    @Test public static void m7() { // InstantiationProcess should fail
        throw new RuntimeException("Crash");
    }
    public static void m8() { }
}
