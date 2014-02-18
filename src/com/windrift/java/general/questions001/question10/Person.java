package com.windrift.java.general.questions001.question10;

import java.util.ArrayList;
import java.util.List;


public class Person
{
    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public int hashCode()
    {
        return 420;
    }

    public static void main(String[] args)
    {
        List<Person> list = new ArrayList();
        list.add(new Person("name1"));
        Person p = new Person("name2");

        /**
         * return false
         * contains is depending Person.equals method, whose default implementation in Object is "o1 == o2"
         */
        System.out.println(list.contains(p));
    }
}
