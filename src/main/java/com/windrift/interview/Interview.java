package com.windrift.interview;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 21/04/12
 * Time: 8:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class Interview {
    public static void main(String[] args) {
      IncDec incdec = new MyIncDecTime(4);
      incdec.increment();
    }

    public static void println(Object o) {
        System.out.println(o);
    }

    //Can you do if (myClassList instanceof List<MyClass>) ?
    public static void m1 () {
        List<String> a = new ArrayList<String>();
        if (a instanceof List) {   //OK
        //if (a instanceof List<String>) {  //NG
        //if (a instanceof ArrayList<String>) {  //NG
            System.out.println("instance");
        }
    }

    //String.inter() method. String a = "foo"; String b = "food".substring(0,3); c = b.intern(); a == c?
    public static void m2 () {
        String a = "foo";
        String b = "food".substring(0,3);
        String c = b.intern();
        if(a==c) { // Yes a==c
            System.out.println("a==c");
        }
    }
    
    //Integer i = null; int j = i; value of j?
    public static void m3() {
        Integer i = null;
        int j = i; //NullPointerException
        System.out.println(j);

        Integer k = i;
        System.out.println(k); //null
    }
    //Check if a string can be encoded in a given format (UTF-8, ASCII...)
    public static void m4 () {
        String a = "徐为贵";
        byte[] a1 = null;
        try{
            a1 = a.getBytes("utf8");
            String t = new String(a.getBytes("utf8"),"utf8" );
            System.out.println(a.equals(t) + t); //true徐为贵

            t = new String(a.getBytes("ascii"),"ascii" );
            System.out.println(a.equals(t) + t); //false???

            t = new String(a.getBytes("gb2312"),"gb2312" );
            System.out.println(a.equals(t) + t); //true徐为贵

          
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        java.nio.charset.Charset.isSupported("ASCII"); // is the charset supported by the JVM
    }


    public static void m5 () {
       println(m5_1());//false
    }

    public static boolean m5_1 () {
        try {
            return true;
        } finally {
            return false;
        }
    }




    public static int findArray(int[] source, int[] tofind ) {
        if (source==null || source.length == 0 || tofind == null || tofind.length == 0) return -1;
        int pos = 0;
        while (source.length - pos >= tofind.length) {
            int i = 0;
            while (i < tofind.length && (tofind[i] == source[pos + i]) )  {
                i++;
            }
            if (i == tofind.length) {
                return pos;
            } else {
                pos++;
            }
        }
        return -1;
    }
    public static Integer multiply(final Integer x, final Integer y) {
        return (y == 0) ? 0 : multiply(x, y - 1) + x;
    }

}

