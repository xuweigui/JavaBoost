package com.windrift.effectivejava.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 27/05/12
 * Time: 10:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class StopThread2 {

    private static boolean stopRequested;


    private synchronized static boolean isStopRequested() {
        System.out.println("isStopRequested called: " + stopRequested);
        return stopRequested;
    }

    private synchronized static void requestStop() {
        System.out.println("requesting stop");
        stopRequested = true;
    }


    public static void main (String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;

                while (!isStopRequested())
                    System.out.println(i++);
            }
        });

        //when using backgroundThread.run(), the thread will never stop.
        //because calling the run method is same as calling a normal method, it will not suspend the thread before
        //the actual logic in the run
        backgroundThread.start();

        //the backgroundThread don't stop after 1 seconds as expected
        TimeUnit.SECONDS.sleep(1);

        requestStop();

        }
    }

