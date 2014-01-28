package com.windrift.scjp;

import java.lang.*;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 6/07/12
 * Time: 10:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class Equals
{
    String name = "";
    String phone = "";
    byte b = 127;

    public Equals(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
    }

    public boolean equals(Equals e)
    {
        return !this.name.equals(e.name) && this.phone.equals(e.phone);
    }

    public static void main(String[] args)
    {
        Equals a = new Equals("Gary", "1234");
        Equals b = new Equals("Gary", "1234");
        System.out.println(a.equals(b));
    }
}
