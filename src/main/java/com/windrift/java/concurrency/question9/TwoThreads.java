package com.windrift.java.concurrency.question9;

import org.apache.commons.lang3.time.StopWatch;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Gary Xu
 */
public class TwoThreads
{
    private static Object resource = new Object();
    private static DateFormat format = new SimpleDateFormat("HH:mm:ss");

    private static void delay(long n)
    {
        try
        {
            Thread.sleep(n);
        }
        catch (Exception e)
        {
            System.out.print("Error ");
            System.out.println(format.format(new Date()));
            e.printStackTrace();
        }
    }

//output is "StartMain Startl EndMain End1 Start2 Error End2"
    public static void main(String[] args)
    {

        System.out.print("StartMain ");
        System.out.println(format.format(new Date()));
        new Thread1().start();
        delay(1000);
        Thread t2 = new Thread2();
        t2.start();
        delay(1000);
        t2.interrupt(); // set the interrupt status, which will cause throwing of InterruptedException when t2.sleep is called.
        delay(1000);
        System.out.print("EndMain ");
        System.out.println(format.format(new Date()));
    }

    static class Thread1 extends Thread
    {
        public void run()
        {
            synchronized (resource)
            {
                System.out.print("Startl ");
                System.out.println(format.format(new Date()));
                delay(6000);
                System.out.print("End1 ");
                System.out.println(format.format(new Date()));
            }
        }

    }

    static class Thread2 extends Thread
    {
        public void run()
        {
            synchronized (resource)
            {
                System.out.print("Start2 ");
                System.out.println(format.format(new Date()));
                delay(2000);
                System.out.print("End2 ");
                System.out.println(format.format(new Date()));
            }
        }

    }
}
