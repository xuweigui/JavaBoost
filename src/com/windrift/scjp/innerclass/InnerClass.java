package com.windrift.scjp.innerclass;

/**
 * Created with IntelliJ IDEA.
 * User: cy
 * Date: 23/12/12
 * Time: 9:30 PM
 * To change this template use File | Settings | File Templates.
 */
class CreateInnerClass
{
    public static void main(String[] s)
    {
        Out out = new Out();
        Out.In in = out.new In(); // shows how to init an Inner class.
    }
}

class Out
{
    class In
    {

    }
}