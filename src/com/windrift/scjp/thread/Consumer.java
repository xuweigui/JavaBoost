package com.windrift.scjp.thread;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 11/06/12
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Consumer extends Thread
{
    private MyStack stack;

    public Consumer(MyStack stack)
    {
        this.stack = stack;
    }

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (stack)
            {
                int x = stack.pop();
                if (x == -1)
                {
                    System.out.println("No product, waiting...");
                    try
                    {
                        stack.wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                    }
                }
                else
                {
                    System.out.println("Just popped " + x);
                }
            }

        }
    }


}
