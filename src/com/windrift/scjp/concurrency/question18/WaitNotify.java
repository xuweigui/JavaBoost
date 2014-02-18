package com.windrift.scjp.concurrency.question18;

/**
 * @author Gary Xu
 */
public class WaitNotify
{
    void waitForSignal() throws InterruptedException
    {
        Object obj = new Object();
        synchronized (Thread.currentThread())
        {
            obj.wait();
            obj.notify();
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        new WaitNotify().waitForSignal();
    }
}
