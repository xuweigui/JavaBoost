package com.windrift.effectivejava.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 27/05/12
 * Time: 10:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class StopThread {
    private static boolean stopRequested = false;
    
    public static void main (String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested)
                    System.out.println(i++);
            }
        });
        //when using backgroundThread.run(), the thread will never stop.
        backgroundThread.start();

        /**
         *  BUT it WORKS in my machine
         */
        //the backgroundThread don't stop after 1 seconds as expected
        /**
         * the compiler may translate the
         * while (!stopRequested)
         *  System.out.println(i++);
         *
         *  to
         *
         *  if (!stopRequested)
         *      while (true)
         *          System.out.println(i++);
         *
         * so the modified value is never read by the backgroundThread
         */
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
