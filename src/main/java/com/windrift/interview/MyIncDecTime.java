package com.windrift.interview;

import java.util.Date;

public class MyIncDecTime extends MyIncDec implements IncDec {
    public MyIncDecTime(int x) {
        super(x);
    }
    public void increment() {
        Date begin = new Date();
        super.increment();
        Date end = new Date();
        System.out.println("invocation of increment takes: " + (end.getTime() - begin.getTime()));
    }
    public void decrement() {
        Date begin = new Date();
        super.decrement();
        Date end = new Date();
        System.out.println("invocation of decrement takes: " + (end.getTime() - begin.getTime()));
    }
}
