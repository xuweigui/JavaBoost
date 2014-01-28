package com.windrift.scjp.thread;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 11/06/12
 * Time: 7:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test
{
    public static void main(String[] args)
    {
        MyStack stack = new MyStack();

        Consumer consumer = new Consumer(stack);
        consumer.start();

        Producer producer = new Producer(stack);
        producer.start();
    }
}
