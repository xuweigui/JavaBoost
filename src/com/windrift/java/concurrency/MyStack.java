package com.windrift.java.concurrency;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 11/06/12
 * Time: 7:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyStack
{
    private int[] values = new int[10];
    private int index = 0;

    public synchronized void push(int x)
    {
        if (index <= 9)
        {
            values[index] = x;
            Thread.yield();
            index++;
        }
    }

    public synchronized int pop()
    {
        if (index > 0)
        {
            index--;
            return values[index];
        }
        else
        {
            return -1;
        }
    }

    public synchronized String toString()
    {
        String reply = "";
        for (int i = 0; i < values.length; i++)
        {
            reply += values[i] + " ";
        }
        return reply;
    }
}
