package com.windrift.scjp.thread;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 11/06/12
 * Time: 7:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Producer extends Thread
{
    private MyStack stack;

    public Producer(MyStack stack)
    {
        this.stack = stack;
    }

    @Override
    public void run()
    {

        while (true)
        {
            int random = (int) (Math.random() * 5);
            stack.push(random);

            System.out.println("Just pushed " + random);

            synchronized (stack)
            {
                stack.notify();
            }

            try
            {
                Thread.sleep(2000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }

    }
}
