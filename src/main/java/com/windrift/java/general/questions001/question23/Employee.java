package com.windrift.java.general.questions001.question23;


interface Data { public void load(); }
abstract class Info { public abstract void load(); }

public class Employee extends Info implements Data
{
    public void load() { /*do something*/ }
}
