package com.windrift.scjp.concurrency;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 7/06/12
 * Time: 3:10 PM
 * To change this template use File | Settings | File Templates.
 */

class MyThread extends Thread

{

    public void run()

    {

        System.out.println("MyThread: run()");

    }

    public void start()

    {

        System.out.println("MyThread: start()");

    }

}

class MyRunnable implements Runnable

{

    public void run()

    {

        System.out.println("MyRunnable: run()");

    }

    public void start()

    {

        System.out.println("MyRunnable: start()");

    }

}

public class ThreadRunnable

{

    public static void main(String args[])

    {

        MyThread myThread = new MyThread();

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);

        myThread.start();

        thread.start();

    }

}

/*
In the above code there is not any compilation error. Thus choice E is incorrect.
Inside main() method, objects of MyThread and MyRunnable class are created followed by
creation of  Thread with object of MyRunnable class.
Note that MyThread class extends Thread class and overrides the start() method of the Thread class.
Thus on execution of myThread.start() statement, the start() method of the MyThread class will be
executed and as a result MyThread:start() will be printed. Had the start() method not there in
 MyThread class, the start() method of the Thread class would be called which in turn would call
 the run() method of the MyThread class.
On execution of concurrency.start();, the start() method of the Thread class would be called which in
turn will call the run() method of the class which is passed to Thread constructor (i.e. MyRunnable class).
Thus MyRunnable:run() will be printed out.
*/
